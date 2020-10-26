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

@Tag("25")
class Record_981 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 981: FirstName is Chadwick")
	void FirstNameOfRecord981() {
		assertEquals("Chadwick", customers.get(980).getFirstName());
	}

	@Test
	@DisplayName("Record 981: LastName is Sumlin")
	void LastNameOfRecord981() {
		assertEquals("Sumlin", customers.get(980).getLastName());
	}

	@Test
	@DisplayName("Record 981: Company is Digital Resources")
	void CompanyOfRecord981() {
		assertEquals("Digital Resources", customers.get(980).getCompany());
	}

	@Test
	@DisplayName("Record 981: Address is 2728 Overdale Dr")
	void AddressOfRecord981() {
		assertEquals("2728 Overdale Dr", customers.get(980).getAddress());
	}

	@Test
	@DisplayName("Record 981: City is Cincinnati")
	void CityOfRecord981() {
		assertEquals("Cincinnati", customers.get(980).getCity());
	}

	@Test
	@DisplayName("Record 981: County is Hamilton")
	void CountyOfRecord981() {
		assertEquals("Hamilton", customers.get(980).getCounty());
	}

	@Test
	@DisplayName("Record 981: State is OH")
	void StateOfRecord981() {
		assertEquals("OH", customers.get(980).getState());
	}

	@Test
	@DisplayName("Record 981: ZIP is 45251")
	void ZIPOfRecord981() {
		assertEquals("45251", customers.get(980).getZIP());
	}

	@Test
	@DisplayName("Record 981: Phone is 513-851-6287")
	void PhoneOfRecord981() {
		assertEquals("513-851-6287", customers.get(980).getPhone());
	}

	@Test
	@DisplayName("Record 981: Fax is 513-851-0935")
	void FaxOfRecord981() {
		assertEquals("513-851-0935", customers.get(980).getFax());
	}

	@Test
	@DisplayName("Record 981: Email is chadwick@sumlin.com")
	void EmailOfRecord981() {
		assertEquals("chadwick@sumlin.com", customers.get(980).getEmail());
	}

	@Test
	@DisplayName("Record 981: Web is http://www.chadwicksumlin.com")
	void WebOfRecord981() {
		assertEquals("http://www.chadwicksumlin.com", customers.get(980).getWeb());
	}
}
