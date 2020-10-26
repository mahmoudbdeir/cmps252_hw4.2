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

@Tag("18")
class Record_2572 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2572: FirstName is Malcom")
	void FirstNameOfRecord2572() {
		assertEquals("Malcom", customers.get(2571).getFirstName());
	}

	@Test
	@DisplayName("Record 2572: LastName is Mcqueen")
	void LastNameOfRecord2572() {
		assertEquals("Mcqueen", customers.get(2571).getLastName());
	}

	@Test
	@DisplayName("Record 2572: Company is Legal 10 Law Office")
	void CompanyOfRecord2572() {
		assertEquals("Legal 10 Law Office", customers.get(2571).getCompany());
	}

	@Test
	@DisplayName("Record 2572: Address is 1700 W Big Beaver Rd  #-355")
	void AddressOfRecord2572() {
		assertEquals("1700 W Big Beaver Rd  #-355", customers.get(2571).getAddress());
	}

	@Test
	@DisplayName("Record 2572: City is Troy")
	void CityOfRecord2572() {
		assertEquals("Troy", customers.get(2571).getCity());
	}

	@Test
	@DisplayName("Record 2572: County is Oakland")
	void CountyOfRecord2572() {
		assertEquals("Oakland", customers.get(2571).getCounty());
	}

	@Test
	@DisplayName("Record 2572: State is MI")
	void StateOfRecord2572() {
		assertEquals("MI", customers.get(2571).getState());
	}

	@Test
	@DisplayName("Record 2572: ZIP is 48084")
	void ZIPOfRecord2572() {
		assertEquals("48084", customers.get(2571).getZIP());
	}

	@Test
	@DisplayName("Record 2572: Phone is 248-643-6917")
	void PhoneOfRecord2572() {
		assertEquals("248-643-6917", customers.get(2571).getPhone());
	}

	@Test
	@DisplayName("Record 2572: Fax is 248-643-3022")
	void FaxOfRecord2572() {
		assertEquals("248-643-3022", customers.get(2571).getFax());
	}

	@Test
	@DisplayName("Record 2572: Email is malcom@mcqueen.com")
	void EmailOfRecord2572() {
		assertEquals("malcom@mcqueen.com", customers.get(2571).getEmail());
	}

	@Test
	@DisplayName("Record 2572: Web is http://www.malcommcqueen.com")
	void WebOfRecord2572() {
		assertEquals("http://www.malcommcqueen.com", customers.get(2571).getWeb());
	}
}
