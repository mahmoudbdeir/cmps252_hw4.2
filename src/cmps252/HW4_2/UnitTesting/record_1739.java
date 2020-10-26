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

@Tag("46")
class Record_1739 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1739: FirstName is Ahmad")
	void FirstNameOfRecord1739() {
		assertEquals("Ahmad", customers.get(1738).getFirstName());
	}

	@Test
	@DisplayName("Record 1739: LastName is Twehous")
	void LastNameOfRecord1739() {
		assertEquals("Twehous", customers.get(1738).getLastName());
	}

	@Test
	@DisplayName("Record 1739: Company is Teterboro Chryslr Plym Jeep")
	void CompanyOfRecord1739() {
		assertEquals("Teterboro Chryslr Plym Jeep", customers.get(1738).getCompany());
	}

	@Test
	@DisplayName("Record 1739: Address is 575 Ridge Rd")
	void AddressOfRecord1739() {
		assertEquals("575 Ridge Rd", customers.get(1738).getAddress());
	}

	@Test
	@DisplayName("Record 1739: City is Monmouth Junction")
	void CityOfRecord1739() {
		assertEquals("Monmouth Junction", customers.get(1738).getCity());
	}

	@Test
	@DisplayName("Record 1739: County is Middlesex")
	void CountyOfRecord1739() {
		assertEquals("Middlesex", customers.get(1738).getCounty());
	}

	@Test
	@DisplayName("Record 1739: State is NJ")
	void StateOfRecord1739() {
		assertEquals("NJ", customers.get(1738).getState());
	}

	@Test
	@DisplayName("Record 1739: ZIP is 8852")
	void ZIPOfRecord1739() {
		assertEquals("8852", customers.get(1738).getZIP());
	}

	@Test
	@DisplayName("Record 1739: Phone is 732-329-9269")
	void PhoneOfRecord1739() {
		assertEquals("732-329-9269", customers.get(1738).getPhone());
	}

	@Test
	@DisplayName("Record 1739: Fax is 732-329-2804")
	void FaxOfRecord1739() {
		assertEquals("732-329-2804", customers.get(1738).getFax());
	}

	@Test
	@DisplayName("Record 1739: Email is ahmad@twehous.com")
	void EmailOfRecord1739() {
		assertEquals("ahmad@twehous.com", customers.get(1738).getEmail());
	}

	@Test
	@DisplayName("Record 1739: Web is http://www.ahmadtwehous.com")
	void WebOfRecord1739() {
		assertEquals("http://www.ahmadtwehous.com", customers.get(1738).getWeb());
	}
}
