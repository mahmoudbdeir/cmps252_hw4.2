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

@Tag("30")
class Record_3364 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3364: FirstName is Jacqueline")
	void FirstNameOfRecord3364() {
		assertEquals("Jacqueline", customers.get(3363).getFirstName());
	}

	@Test
	@DisplayName("Record 3364: LastName is Corbitt")
	void LastNameOfRecord3364() {
		assertEquals("Corbitt", customers.get(3363).getLastName());
	}

	@Test
	@DisplayName("Record 3364: Company is University Of Texas Pan Amercn")
	void CompanyOfRecord3364() {
		assertEquals("University Of Texas Pan Amercn", customers.get(3363).getCompany());
	}

	@Test
	@DisplayName("Record 3364: Address is 1113 Pontiac Trl")
	void AddressOfRecord3364() {
		assertEquals("1113 Pontiac Trl", customers.get(3363).getAddress());
	}

	@Test
	@DisplayName("Record 3364: City is Ann Arbor")
	void CityOfRecord3364() {
		assertEquals("Ann Arbor", customers.get(3363).getCity());
	}

	@Test
	@DisplayName("Record 3364: County is Washtenaw")
	void CountyOfRecord3364() {
		assertEquals("Washtenaw", customers.get(3363).getCounty());
	}

	@Test
	@DisplayName("Record 3364: State is MI")
	void StateOfRecord3364() {
		assertEquals("MI", customers.get(3363).getState());
	}

	@Test
	@DisplayName("Record 3364: ZIP is 48105")
	void ZIPOfRecord3364() {
		assertEquals("48105", customers.get(3363).getZIP());
	}

	@Test
	@DisplayName("Record 3364: Phone is 734-995-0930")
	void PhoneOfRecord3364() {
		assertEquals("734-995-0930", customers.get(3363).getPhone());
	}

	@Test
	@DisplayName("Record 3364: Fax is 734-995-1765")
	void FaxOfRecord3364() {
		assertEquals("734-995-1765", customers.get(3363).getFax());
	}

	@Test
	@DisplayName("Record 3364: Email is jacqueline@corbitt.com")
	void EmailOfRecord3364() {
		assertEquals("jacqueline@corbitt.com", customers.get(3363).getEmail());
	}

	@Test
	@DisplayName("Record 3364: Web is http://www.jacquelinecorbitt.com")
	void WebOfRecord3364() {
		assertEquals("http://www.jacquelinecorbitt.com", customers.get(3363).getWeb());
	}
}
