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

@Tag("12")
class Record_3756 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3756: FirstName is Marc")
	void FirstNameOfRecord3756() {
		assertEquals("Marc", customers.get(3755).getFirstName());
	}

	@Test
	@DisplayName("Record 3756: LastName is Scurry")
	void LastNameOfRecord3756() {
		assertEquals("Scurry", customers.get(3755).getLastName());
	}

	@Test
	@DisplayName("Record 3756: Company is Koll, Steve")
	void CompanyOfRecord3756() {
		assertEquals("Koll, Steve", customers.get(3755).getCompany());
	}

	@Test
	@DisplayName("Record 3756: Address is 2091 Rand Rd  #-b")
	void AddressOfRecord3756() {
		assertEquals("2091 Rand Rd  #-b", customers.get(3755).getAddress());
	}

	@Test
	@DisplayName("Record 3756: City is Rapid City")
	void CityOfRecord3756() {
		assertEquals("Rapid City", customers.get(3755).getCity());
	}

	@Test
	@DisplayName("Record 3756: County is Pennington")
	void CountyOfRecord3756() {
		assertEquals("Pennington", customers.get(3755).getCounty());
	}

	@Test
	@DisplayName("Record 3756: State is SD")
	void StateOfRecord3756() {
		assertEquals("SD", customers.get(3755).getState());
	}

	@Test
	@DisplayName("Record 3756: ZIP is 57702")
	void ZIPOfRecord3756() {
		assertEquals("57702", customers.get(3755).getZIP());
	}

	@Test
	@DisplayName("Record 3756: Phone is 605-342-4776")
	void PhoneOfRecord3756() {
		assertEquals("605-342-4776", customers.get(3755).getPhone());
	}

	@Test
	@DisplayName("Record 3756: Fax is 605-342-2842")
	void FaxOfRecord3756() {
		assertEquals("605-342-2842", customers.get(3755).getFax());
	}

	@Test
	@DisplayName("Record 3756: Email is marc@scurry.com")
	void EmailOfRecord3756() {
		assertEquals("marc@scurry.com", customers.get(3755).getEmail());
	}

	@Test
	@DisplayName("Record 3756: Web is http://www.marcscurry.com")
	void WebOfRecord3756() {
		assertEquals("http://www.marcscurry.com", customers.get(3755).getWeb());
	}
}
