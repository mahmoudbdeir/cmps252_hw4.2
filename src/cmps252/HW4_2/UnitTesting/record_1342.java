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

@Tag("48")
class Record_1342 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1342: FirstName is Ericka")
	void FirstNameOfRecord1342() {
		assertEquals("Ericka", customers.get(1341).getFirstName());
	}

	@Test
	@DisplayName("Record 1342: LastName is Heyer")
	void LastNameOfRecord1342() {
		assertEquals("Heyer", customers.get(1341).getLastName());
	}

	@Test
	@DisplayName("Record 1342: Company is P & A Conveyor Sales")
	void CompanyOfRecord1342() {
		assertEquals("P & A Conveyor Sales", customers.get(1341).getCompany());
	}

	@Test
	@DisplayName("Record 1342: Address is 3213 E Colfax Ave")
	void AddressOfRecord1342() {
		assertEquals("3213 E Colfax Ave", customers.get(1341).getAddress());
	}

	@Test
	@DisplayName("Record 1342: City is Denver")
	void CityOfRecord1342() {
		assertEquals("Denver", customers.get(1341).getCity());
	}

	@Test
	@DisplayName("Record 1342: County is Denver")
	void CountyOfRecord1342() {
		assertEquals("Denver", customers.get(1341).getCounty());
	}

	@Test
	@DisplayName("Record 1342: State is CO")
	void StateOfRecord1342() {
		assertEquals("CO", customers.get(1341).getState());
	}

	@Test
	@DisplayName("Record 1342: ZIP is 80206")
	void ZIPOfRecord1342() {
		assertEquals("80206", customers.get(1341).getZIP());
	}

	@Test
	@DisplayName("Record 1342: Phone is 303-393-6162")
	void PhoneOfRecord1342() {
		assertEquals("303-393-6162", customers.get(1341).getPhone());
	}

	@Test
	@DisplayName("Record 1342: Fax is 303-393-8995")
	void FaxOfRecord1342() {
		assertEquals("303-393-8995", customers.get(1341).getFax());
	}

	@Test
	@DisplayName("Record 1342: Email is ericka@heyer.com")
	void EmailOfRecord1342() {
		assertEquals("ericka@heyer.com", customers.get(1341).getEmail());
	}

	@Test
	@DisplayName("Record 1342: Web is http://www.erickaheyer.com")
	void WebOfRecord1342() {
		assertEquals("http://www.erickaheyer.com", customers.get(1341).getWeb());
	}
}
