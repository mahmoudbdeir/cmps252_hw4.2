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
class Record_2774 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2774: FirstName is Carey")
	void FirstNameOfRecord2774() {
		assertEquals("Carey", customers.get(2773).getFirstName());
	}

	@Test
	@DisplayName("Record 2774: LastName is Dukart")
	void LastNameOfRecord2774() {
		assertEquals("Dukart", customers.get(2773).getLastName());
	}

	@Test
	@DisplayName("Record 2774: Company is Jolin Paving & Excavating Inc")
	void CompanyOfRecord2774() {
		assertEquals("Jolin Paving & Excavating Inc", customers.get(2773).getCompany());
	}

	@Test
	@DisplayName("Record 2774: Address is 165 S Union Blvd  #-660")
	void AddressOfRecord2774() {
		assertEquals("165 S Union Blvd  #-660", customers.get(2773).getAddress());
	}

	@Test
	@DisplayName("Record 2774: City is Denver")
	void CityOfRecord2774() {
		assertEquals("Denver", customers.get(2773).getCity());
	}

	@Test
	@DisplayName("Record 2774: County is Jefferson")
	void CountyOfRecord2774() {
		assertEquals("Jefferson", customers.get(2773).getCounty());
	}

	@Test
	@DisplayName("Record 2774: State is CO")
	void StateOfRecord2774() {
		assertEquals("CO", customers.get(2773).getState());
	}

	@Test
	@DisplayName("Record 2774: ZIP is 80228")
	void ZIPOfRecord2774() {
		assertEquals("80228", customers.get(2773).getZIP());
	}

	@Test
	@DisplayName("Record 2774: Phone is 303-988-0413")
	void PhoneOfRecord2774() {
		assertEquals("303-988-0413", customers.get(2773).getPhone());
	}

	@Test
	@DisplayName("Record 2774: Fax is 303-988-3927")
	void FaxOfRecord2774() {
		assertEquals("303-988-3927", customers.get(2773).getFax());
	}

	@Test
	@DisplayName("Record 2774: Email is carey@dukart.com")
	void EmailOfRecord2774() {
		assertEquals("carey@dukart.com", customers.get(2773).getEmail());
	}

	@Test
	@DisplayName("Record 2774: Web is http://www.careydukart.com")
	void WebOfRecord2774() {
		assertEquals("http://www.careydukart.com", customers.get(2773).getWeb());
	}
}
