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
class Record_3585 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3585: FirstName is Kip")
	void FirstNameOfRecord3585() {
		assertEquals("Kip", customers.get(3584).getFirstName());
	}

	@Test
	@DisplayName("Record 3585: LastName is Noordam")
	void LastNameOfRecord3585() {
		assertEquals("Noordam", customers.get(3584).getLastName());
	}

	@Test
	@DisplayName("Record 3585: Company is Blue Ribbon Secretarial Svc")
	void CompanyOfRecord3585() {
		assertEquals("Blue Ribbon Secretarial Svc", customers.get(3584).getCompany());
	}

	@Test
	@DisplayName("Record 3585: Address is 550 Sylvan Ave  #-102")
	void AddressOfRecord3585() {
		assertEquals("550 Sylvan Ave  #-102", customers.get(3584).getAddress());
	}

	@Test
	@DisplayName("Record 3585: City is Englewood Cliffs")
	void CityOfRecord3585() {
		assertEquals("Englewood Cliffs", customers.get(3584).getCity());
	}

	@Test
	@DisplayName("Record 3585: County is Bergen")
	void CountyOfRecord3585() {
		assertEquals("Bergen", customers.get(3584).getCounty());
	}

	@Test
	@DisplayName("Record 3585: State is NJ")
	void StateOfRecord3585() {
		assertEquals("NJ", customers.get(3584).getState());
	}

	@Test
	@DisplayName("Record 3585: ZIP is 7632")
	void ZIPOfRecord3585() {
		assertEquals("7632", customers.get(3584).getZIP());
	}

	@Test
	@DisplayName("Record 3585: Phone is 201-568-3738")
	void PhoneOfRecord3585() {
		assertEquals("201-568-3738", customers.get(3584).getPhone());
	}

	@Test
	@DisplayName("Record 3585: Fax is 201-568-1848")
	void FaxOfRecord3585() {
		assertEquals("201-568-1848", customers.get(3584).getFax());
	}

	@Test
	@DisplayName("Record 3585: Email is kip@noordam.com")
	void EmailOfRecord3585() {
		assertEquals("kip@noordam.com", customers.get(3584).getEmail());
	}

	@Test
	@DisplayName("Record 3585: Web is http://www.kipnoordam.com")
	void WebOfRecord3585() {
		assertEquals("http://www.kipnoordam.com", customers.get(3584).getWeb());
	}
}
