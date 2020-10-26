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

@Tag("10")
class Record_3123 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3123: FirstName is Clemente")
	void FirstNameOfRecord3123() {
		assertEquals("Clemente", customers.get(3122).getFirstName());
	}

	@Test
	@DisplayName("Record 3123: LastName is Aboulissan")
	void LastNameOfRecord3123() {
		assertEquals("Aboulissan", customers.get(3122).getLastName());
	}

	@Test
	@DisplayName("Record 3123: Company is Patrick M Kirby Pc")
	void CompanyOfRecord3123() {
		assertEquals("Patrick M Kirby Pc", customers.get(3122).getCompany());
	}

	@Test
	@DisplayName("Record 3123: Address is 8554 Alameda Ave")
	void AddressOfRecord3123() {
		assertEquals("8554 Alameda Ave", customers.get(3122).getAddress());
	}

	@Test
	@DisplayName("Record 3123: City is El Paso")
	void CityOfRecord3123() {
		assertEquals("El Paso", customers.get(3122).getCity());
	}

	@Test
	@DisplayName("Record 3123: County is El Paso")
	void CountyOfRecord3123() {
		assertEquals("El Paso", customers.get(3122).getCounty());
	}

	@Test
	@DisplayName("Record 3123: State is TX")
	void StateOfRecord3123() {
		assertEquals("TX", customers.get(3122).getState());
	}

	@Test
	@DisplayName("Record 3123: ZIP is 79907")
	void ZIPOfRecord3123() {
		assertEquals("79907", customers.get(3122).getZIP());
	}

	@Test
	@DisplayName("Record 3123: Phone is 915-859-0320")
	void PhoneOfRecord3123() {
		assertEquals("915-859-0320", customers.get(3122).getPhone());
	}

	@Test
	@DisplayName("Record 3123: Fax is 915-859-0092")
	void FaxOfRecord3123() {
		assertEquals("915-859-0092", customers.get(3122).getFax());
	}

	@Test
	@DisplayName("Record 3123: Email is clemente@aboulissan.com")
	void EmailOfRecord3123() {
		assertEquals("clemente@aboulissan.com", customers.get(3122).getEmail());
	}

	@Test
	@DisplayName("Record 3123: Web is http://www.clementeaboulissan.com")
	void WebOfRecord3123() {
		assertEquals("http://www.clementeaboulissan.com", customers.get(3122).getWeb());
	}
}
