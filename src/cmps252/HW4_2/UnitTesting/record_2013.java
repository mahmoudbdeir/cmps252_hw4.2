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

@Tag("3")
class Record_2013 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2013: FirstName is Lara")
	void FirstNameOfRecord2013() {
		assertEquals("Lara", customers.get(2012).getFirstName());
	}

	@Test
	@DisplayName("Record 2013: LastName is Luxon")
	void LastNameOfRecord2013() {
		assertEquals("Luxon", customers.get(2012).getLastName());
	}

	@Test
	@DisplayName("Record 2013: Company is Canon Commercial Calculators")
	void CompanyOfRecord2013() {
		assertEquals("Canon Commercial Calculators", customers.get(2012).getCompany());
	}

	@Test
	@DisplayName("Record 2013: Address is 1415 N Midland Blvd")
	void AddressOfRecord2013() {
		assertEquals("1415 N Midland Blvd", customers.get(2012).getAddress());
	}

	@Test
	@DisplayName("Record 2013: City is Nampa")
	void CityOfRecord2013() {
		assertEquals("Nampa", customers.get(2012).getCity());
	}

	@Test
	@DisplayName("Record 2013: County is Canyon")
	void CountyOfRecord2013() {
		assertEquals("Canyon", customers.get(2012).getCounty());
	}

	@Test
	@DisplayName("Record 2013: State is ID")
	void StateOfRecord2013() {
		assertEquals("ID", customers.get(2012).getState());
	}

	@Test
	@DisplayName("Record 2013: ZIP is 83651")
	void ZIPOfRecord2013() {
		assertEquals("83651", customers.get(2012).getZIP());
	}

	@Test
	@DisplayName("Record 2013: Phone is 208-467-1240")
	void PhoneOfRecord2013() {
		assertEquals("208-467-1240", customers.get(2012).getPhone());
	}

	@Test
	@DisplayName("Record 2013: Fax is 208-467-8624")
	void FaxOfRecord2013() {
		assertEquals("208-467-8624", customers.get(2012).getFax());
	}

	@Test
	@DisplayName("Record 2013: Email is lara@luxon.com")
	void EmailOfRecord2013() {
		assertEquals("lara@luxon.com", customers.get(2012).getEmail());
	}

	@Test
	@DisplayName("Record 2013: Web is http://www.laraluxon.com")
	void WebOfRecord2013() {
		assertEquals("http://www.laraluxon.com", customers.get(2012).getWeb());
	}
}
