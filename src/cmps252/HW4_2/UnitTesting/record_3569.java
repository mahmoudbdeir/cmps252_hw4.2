package cmps252.HW4_2.UnitTesting;

import static org.junit.jupiter.api.Assertions.*;
import java.io.FileNotFoundException;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import cmps252.HW4_2.Customer;
import cmps252.HW4_2.FileParser;

@Tag("44")
class Record_3569 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3569: FirstName is Mae")
	void FirstNameOfRecord3569() {
		assertEquals("Mae", customers.get(3568).getFirstName());
	}

	@Test
	@DisplayName("Record 3569: LastName is Botros")
	void LastNameOfRecord3569() {
		assertEquals("Botros", customers.get(3568).getLastName());
	}

	@Test
	@DisplayName("Record 3569: Company is Mcwilliams, Sarah M Esq")
	void CompanyOfRecord3569() {
		assertEquals("Mcwilliams, Sarah M Esq", customers.get(3568).getCompany());
	}

	@Test
	@DisplayName("Record 3569: Address is 5457 S 1st St")
	void AddressOfRecord3569() {
		assertEquals("5457 S 1st St", customers.get(3568).getAddress());
	}

	@Test
	@DisplayName("Record 3569: City is Abilene")
	void CityOfRecord3569() {
		assertEquals("Abilene", customers.get(3568).getCity());
	}

	@Test
	@DisplayName("Record 3569: County is Taylor")
	void CountyOfRecord3569() {
		assertEquals("Taylor", customers.get(3568).getCounty());
	}

	@Test
	@DisplayName("Record 3569: State is TX")
	void StateOfRecord3569() {
		assertEquals("TX", customers.get(3568).getState());
	}

	@Test
	@DisplayName("Record 3569: ZIP is 79605")
	void ZIPOfRecord3569() {
		assertEquals("79605", customers.get(3568).getZIP());
	}

	@Test
	@DisplayName("Record 3569: Phone is 325-692-1098")
	void PhoneOfRecord3569() {
		assertEquals("325-692-1098", customers.get(3568).getPhone());
	}

	@Test
	@DisplayName("Record 3569: Fax is 325-692-6577")
	void FaxOfRecord3569() {
		assertEquals("325-692-6577", customers.get(3568).getFax());
	}

	@Test
	@DisplayName("Record 3569: Email is mae@botros.com")
	void EmailOfRecord3569() {
		assertEquals("mae@botros.com", customers.get(3568).getEmail());
	}

	@Test
	@DisplayName("Record 3569: Web is http://www.maebotros.com")
	void WebOfRecord3569() {
		assertEquals("http://www.maebotros.com", customers.get(3568).getWeb());
	}
}
