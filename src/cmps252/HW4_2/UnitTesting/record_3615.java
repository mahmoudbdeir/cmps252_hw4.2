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

@Tag("12")
class Record_3615 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3615: FirstName is Marci")
	void FirstNameOfRecord3615() {
		assertEquals("Marci", customers.get(3614).getFirstName());
	}

	@Test
	@DisplayName("Record 3615: LastName is Bougie")
	void LastNameOfRecord3615() {
		assertEquals("Bougie", customers.get(3614).getLastName());
	}

	@Test
	@DisplayName("Record 3615: Company is Wallace, Peter R Esq")
	void CompanyOfRecord3615() {
		assertEquals("Wallace, Peter R Esq", customers.get(3614).getCompany());
	}

	@Test
	@DisplayName("Record 3615: Address is 400 Lafayette St")
	void AddressOfRecord3615() {
		assertEquals("400 Lafayette St", customers.get(3614).getAddress());
	}

	@Test
	@DisplayName("Record 3615: City is New Orleans")
	void CityOfRecord3615() {
		assertEquals("New Orleans", customers.get(3614).getCity());
	}

	@Test
	@DisplayName("Record 3615: County is Orleans")
	void CountyOfRecord3615() {
		assertEquals("Orleans", customers.get(3614).getCounty());
	}

	@Test
	@DisplayName("Record 3615: State is LA")
	void StateOfRecord3615() {
		assertEquals("LA", customers.get(3614).getState());
	}

	@Test
	@DisplayName("Record 3615: ZIP is 70130")
	void ZIPOfRecord3615() {
		assertEquals("70130", customers.get(3614).getZIP());
	}

	@Test
	@DisplayName("Record 3615: Phone is 504-524-4814")
	void PhoneOfRecord3615() {
		assertEquals("504-524-4814", customers.get(3614).getPhone());
	}

	@Test
	@DisplayName("Record 3615: Fax is 504-524-1579")
	void FaxOfRecord3615() {
		assertEquals("504-524-1579", customers.get(3614).getFax());
	}

	@Test
	@DisplayName("Record 3615: Email is marci@bougie.com")
	void EmailOfRecord3615() {
		assertEquals("marci@bougie.com", customers.get(3614).getEmail());
	}

	@Test
	@DisplayName("Record 3615: Web is http://www.marcibougie.com")
	void WebOfRecord3615() {
		assertEquals("http://www.marcibougie.com", customers.get(3614).getWeb());
	}
}
