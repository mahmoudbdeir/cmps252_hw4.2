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
class Record_2771 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2771: FirstName is Buck")
	void FirstNameOfRecord2771() {
		assertEquals("Buck", customers.get(2770).getFirstName());
	}

	@Test
	@DisplayName("Record 2771: LastName is Pavelski")
	void LastNameOfRecord2771() {
		assertEquals("Pavelski", customers.get(2770).getLastName());
	}

	@Test
	@DisplayName("Record 2771: Company is Black, Tom A Esq")
	void CompanyOfRecord2771() {
		assertEquals("Black, Tom A Esq", customers.get(2770).getCompany());
	}

	@Test
	@DisplayName("Record 2771: Address is 244 A Route 17k K")
	void AddressOfRecord2771() {
		assertEquals("244 A Route 17k K", customers.get(2770).getAddress());
	}

	@Test
	@DisplayName("Record 2771: City is Newburgh")
	void CityOfRecord2771() {
		assertEquals("Newburgh", customers.get(2770).getCity());
	}

	@Test
	@DisplayName("Record 2771: County is Orange")
	void CountyOfRecord2771() {
		assertEquals("Orange", customers.get(2770).getCounty());
	}

	@Test
	@DisplayName("Record 2771: State is NY")
	void StateOfRecord2771() {
		assertEquals("NY", customers.get(2770).getState());
	}

	@Test
	@DisplayName("Record 2771: ZIP is 12550")
	void ZIPOfRecord2771() {
		assertEquals("12550", customers.get(2770).getZIP());
	}

	@Test
	@DisplayName("Record 2771: Phone is 845-564-3870")
	void PhoneOfRecord2771() {
		assertEquals("845-564-3870", customers.get(2770).getPhone());
	}

	@Test
	@DisplayName("Record 2771: Fax is 845-564-6787")
	void FaxOfRecord2771() {
		assertEquals("845-564-6787", customers.get(2770).getFax());
	}

	@Test
	@DisplayName("Record 2771: Email is buck@pavelski.com")
	void EmailOfRecord2771() {
		assertEquals("buck@pavelski.com", customers.get(2770).getEmail());
	}

	@Test
	@DisplayName("Record 2771: Web is http://www.buckpavelski.com")
	void WebOfRecord2771() {
		assertEquals("http://www.buckpavelski.com", customers.get(2770).getWeb());
	}
}
