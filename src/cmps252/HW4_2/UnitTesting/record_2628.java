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

@Tag("38")
class Record_2628 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2628: FirstName is Fabian")
	void FirstNameOfRecord2628() {
		assertEquals("Fabian", customers.get(2627).getFirstName());
	}

	@Test
	@DisplayName("Record 2628: LastName is Fooks")
	void LastNameOfRecord2628() {
		assertEquals("Fooks", customers.get(2627).getLastName());
	}

	@Test
	@DisplayName("Record 2628: Company is Multiple Sclerosis Scty Santa")
	void CompanyOfRecord2628() {
		assertEquals("Multiple Sclerosis Scty Santa", customers.get(2627).getCompany());
	}

	@Test
	@DisplayName("Record 2628: Address is 408 Connecticut Ave")
	void AddressOfRecord2628() {
		assertEquals("408 Connecticut Ave", customers.get(2627).getAddress());
	}

	@Test
	@DisplayName("Record 2628: City is Norwalk")
	void CityOfRecord2628() {
		assertEquals("Norwalk", customers.get(2627).getCity());
	}

	@Test
	@DisplayName("Record 2628: County is Fairfield")
	void CountyOfRecord2628() {
		assertEquals("Fairfield", customers.get(2627).getCounty());
	}

	@Test
	@DisplayName("Record 2628: State is CT")
	void StateOfRecord2628() {
		assertEquals("CT", customers.get(2627).getState());
	}

	@Test
	@DisplayName("Record 2628: ZIP is 6854")
	void ZIPOfRecord2628() {
		assertEquals("6854", customers.get(2627).getZIP());
	}

	@Test
	@DisplayName("Record 2628: Phone is 203-852-7437")
	void PhoneOfRecord2628() {
		assertEquals("203-852-7437", customers.get(2627).getPhone());
	}

	@Test
	@DisplayName("Record 2628: Fax is 203-852-2608")
	void FaxOfRecord2628() {
		assertEquals("203-852-2608", customers.get(2627).getFax());
	}

	@Test
	@DisplayName("Record 2628: Email is fabian@fooks.com")
	void EmailOfRecord2628() {
		assertEquals("fabian@fooks.com", customers.get(2627).getEmail());
	}

	@Test
	@DisplayName("Record 2628: Web is http://www.fabianfooks.com")
	void WebOfRecord2628() {
		assertEquals("http://www.fabianfooks.com", customers.get(2627).getWeb());
	}
}
