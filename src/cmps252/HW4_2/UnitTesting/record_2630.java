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

@Tag("37")
class Record_2630 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2630: FirstName is Elvis")
	void FirstNameOfRecord2630() {
		assertEquals("Elvis", customers.get(2629).getFirstName());
	}

	@Test
	@DisplayName("Record 2630: LastName is Sorber")
	void LastNameOfRecord2630() {
		assertEquals("Sorber", customers.get(2629).getLastName());
	}

	@Test
	@DisplayName("Record 2630: Company is Bennett, Lawrence A Phd")
	void CompanyOfRecord2630() {
		assertEquals("Bennett, Lawrence A Phd", customers.get(2629).getCompany());
	}

	@Test
	@DisplayName("Record 2630: Address is 1 N Bacton Hill Rd")
	void AddressOfRecord2630() {
		assertEquals("1 N Bacton Hill Rd", customers.get(2629).getAddress());
	}

	@Test
	@DisplayName("Record 2630: City is Malvern")
	void CityOfRecord2630() {
		assertEquals("Malvern", customers.get(2629).getCity());
	}

	@Test
	@DisplayName("Record 2630: County is Chester")
	void CountyOfRecord2630() {
		assertEquals("Chester", customers.get(2629).getCounty());
	}

	@Test
	@DisplayName("Record 2630: State is PA")
	void StateOfRecord2630() {
		assertEquals("PA", customers.get(2629).getState());
	}

	@Test
	@DisplayName("Record 2630: ZIP is 19355")
	void ZIPOfRecord2630() {
		assertEquals("19355", customers.get(2629).getZIP());
	}

	@Test
	@DisplayName("Record 2630: Phone is 610-935-0031")
	void PhoneOfRecord2630() {
		assertEquals("610-935-0031", customers.get(2629).getPhone());
	}

	@Test
	@DisplayName("Record 2630: Fax is 610-935-7977")
	void FaxOfRecord2630() {
		assertEquals("610-935-7977", customers.get(2629).getFax());
	}

	@Test
	@DisplayName("Record 2630: Email is elvis@sorber.com")
	void EmailOfRecord2630() {
		assertEquals("elvis@sorber.com", customers.get(2629).getEmail());
	}

	@Test
	@DisplayName("Record 2630: Web is http://www.elvissorber.com")
	void WebOfRecord2630() {
		assertEquals("http://www.elvissorber.com", customers.get(2629).getWeb());
	}
}
