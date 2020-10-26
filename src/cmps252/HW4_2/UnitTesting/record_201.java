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

@Tag("24")
class Record_201 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 201: FirstName is Debra")
	void FirstNameOfRecord201() {
		assertEquals("Debra", customers.get(200).getFirstName());
	}

	@Test
	@DisplayName("Record 201: LastName is Elmo")
	void LastNameOfRecord201() {
		assertEquals("Elmo", customers.get(200).getLastName());
	}

	@Test
	@DisplayName("Record 201: Company is Hunterdon Concrete")
	void CompanyOfRecord201() {
		assertEquals("Hunterdon Concrete", customers.get(200).getCompany());
	}

	@Test
	@DisplayName("Record 201: Address is 2250 Kalakaua Ave  #-310")
	void AddressOfRecord201() {
		assertEquals("2250 Kalakaua Ave  #-310", customers.get(200).getAddress());
	}

	@Test
	@DisplayName("Record 201: City is Honolulu")
	void CityOfRecord201() {
		assertEquals("Honolulu", customers.get(200).getCity());
	}

	@Test
	@DisplayName("Record 201: County is Honolulu")
	void CountyOfRecord201() {
		assertEquals("Honolulu", customers.get(200).getCounty());
	}

	@Test
	@DisplayName("Record 201: State is HI")
	void StateOfRecord201() {
		assertEquals("HI", customers.get(200).getState());
	}

	@Test
	@DisplayName("Record 201: ZIP is 96815")
	void ZIPOfRecord201() {
		assertEquals("96815", customers.get(200).getZIP());
	}

	@Test
	@DisplayName("Record 201: Phone is 808-923-3649")
	void PhoneOfRecord201() {
		assertEquals("808-923-3649", customers.get(200).getPhone());
	}

	@Test
	@DisplayName("Record 201: Fax is 808-923-6898")
	void FaxOfRecord201() {
		assertEquals("808-923-6898", customers.get(200).getFax());
	}

	@Test
	@DisplayName("Record 201: Email is debra@elmo.com")
	void EmailOfRecord201() {
		assertEquals("debra@elmo.com", customers.get(200).getEmail());
	}

	@Test
	@DisplayName("Record 201: Web is http://www.debraelmo.com")
	void WebOfRecord201() {
		assertEquals("http://www.debraelmo.com", customers.get(200).getWeb());
	}
}
