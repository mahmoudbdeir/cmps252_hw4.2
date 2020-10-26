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

@Tag("28")
class Record_2736 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2736: FirstName is Pamela")
	void FirstNameOfRecord2736() {
		assertEquals("Pamela", customers.get(2735).getFirstName());
	}

	@Test
	@DisplayName("Record 2736: LastName is Petgrave")
	void LastNameOfRecord2736() {
		assertEquals("Petgrave", customers.get(2735).getLastName());
	}

	@Test
	@DisplayName("Record 2736: Company is All Amercn Sign Shops Corprt")
	void CompanyOfRecord2736() {
		assertEquals("All Amercn Sign Shops Corprt", customers.get(2735).getCompany());
	}

	@Test
	@DisplayName("Record 2736: Address is 801 Lancaster Ave")
	void AddressOfRecord2736() {
		assertEquals("801 Lancaster Ave", customers.get(2735).getAddress());
	}

	@Test
	@DisplayName("Record 2736: City is Reading")
	void CityOfRecord2736() {
		assertEquals("Reading", customers.get(2735).getCity());
	}

	@Test
	@DisplayName("Record 2736: County is Berks")
	void CountyOfRecord2736() {
		assertEquals("Berks", customers.get(2735).getCounty());
	}

	@Test
	@DisplayName("Record 2736: State is PA")
	void StateOfRecord2736() {
		assertEquals("PA", customers.get(2735).getState());
	}

	@Test
	@DisplayName("Record 2736: ZIP is 19607")
	void ZIPOfRecord2736() {
		assertEquals("19607", customers.get(2735).getZIP());
	}

	@Test
	@DisplayName("Record 2736: Phone is 610-775-9533")
	void PhoneOfRecord2736() {
		assertEquals("610-775-9533", customers.get(2735).getPhone());
	}

	@Test
	@DisplayName("Record 2736: Fax is 610-775-2259")
	void FaxOfRecord2736() {
		assertEquals("610-775-2259", customers.get(2735).getFax());
	}

	@Test
	@DisplayName("Record 2736: Email is pamela@petgrave.com")
	void EmailOfRecord2736() {
		assertEquals("pamela@petgrave.com", customers.get(2735).getEmail());
	}

	@Test
	@DisplayName("Record 2736: Web is http://www.pamelapetgrave.com")
	void WebOfRecord2736() {
		assertEquals("http://www.pamelapetgrave.com", customers.get(2735).getWeb());
	}
}
