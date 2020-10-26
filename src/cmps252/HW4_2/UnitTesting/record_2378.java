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

@Tag("31")
class Record_2378 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2378: FirstName is Phil")
	void FirstNameOfRecord2378() {
		assertEquals("Phil", customers.get(2377).getFirstName());
	}

	@Test
	@DisplayName("Record 2378: LastName is Fellezs")
	void LastNameOfRecord2378() {
		assertEquals("Fellezs", customers.get(2377).getLastName());
	}

	@Test
	@DisplayName("Record 2378: Company is Chartiers Valley Shopping Ctr")
	void CompanyOfRecord2378() {
		assertEquals("Chartiers Valley Shopping Ctr", customers.get(2377).getCompany());
	}

	@Test
	@DisplayName("Record 2378: Address is 413 S Riverside Dr")
	void AddressOfRecord2378() {
		assertEquals("413 S Riverside Dr", customers.get(2377).getAddress());
	}

	@Test
	@DisplayName("Record 2378: City is Modesto")
	void CityOfRecord2378() {
		assertEquals("Modesto", customers.get(2377).getCity());
	}

	@Test
	@DisplayName("Record 2378: County is Stanislaus")
	void CountyOfRecord2378() {
		assertEquals("Stanislaus", customers.get(2377).getCounty());
	}

	@Test
	@DisplayName("Record 2378: State is CA")
	void StateOfRecord2378() {
		assertEquals("CA", customers.get(2377).getState());
	}

	@Test
	@DisplayName("Record 2378: ZIP is 95354")
	void ZIPOfRecord2378() {
		assertEquals("95354", customers.get(2377).getZIP());
	}

	@Test
	@DisplayName("Record 2378: Phone is 209-577-6430")
	void PhoneOfRecord2378() {
		assertEquals("209-577-6430", customers.get(2377).getPhone());
	}

	@Test
	@DisplayName("Record 2378: Fax is 209-577-5594")
	void FaxOfRecord2378() {
		assertEquals("209-577-5594", customers.get(2377).getFax());
	}

	@Test
	@DisplayName("Record 2378: Email is phil@fellezs.com")
	void EmailOfRecord2378() {
		assertEquals("phil@fellezs.com", customers.get(2377).getEmail());
	}

	@Test
	@DisplayName("Record 2378: Web is http://www.philfellezs.com")
	void WebOfRecord2378() {
		assertEquals("http://www.philfellezs.com", customers.get(2377).getWeb());
	}
}
