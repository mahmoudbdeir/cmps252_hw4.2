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
class Record_2002 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2002: FirstName is Renae")
	void FirstNameOfRecord2002() {
		assertEquals("Renae", customers.get(2001).getFirstName());
	}

	@Test
	@DisplayName("Record 2002: LastName is Scharbrough")
	void LastNameOfRecord2002() {
		assertEquals("Scharbrough", customers.get(2001).getLastName());
	}

	@Test
	@DisplayName("Record 2002: Company is Learning Disab Assn Amer")
	void CompanyOfRecord2002() {
		assertEquals("Learning Disab Assn Amer", customers.get(2001).getCompany());
	}

	@Test
	@DisplayName("Record 2002: Address is 10881 S Englehart Ave")
	void AddressOfRecord2002() {
		assertEquals("10881 S Englehart Ave", customers.get(2001).getAddress());
	}

	@Test
	@DisplayName("Record 2002: City is Reedley")
	void CityOfRecord2002() {
		assertEquals("Reedley", customers.get(2001).getCity());
	}

	@Test
	@DisplayName("Record 2002: County is Fresno")
	void CountyOfRecord2002() {
		assertEquals("Fresno", customers.get(2001).getCounty());
	}

	@Test
	@DisplayName("Record 2002: State is CA")
	void StateOfRecord2002() {
		assertEquals("CA", customers.get(2001).getState());
	}

	@Test
	@DisplayName("Record 2002: ZIP is 93654")
	void ZIPOfRecord2002() {
		assertEquals("93654", customers.get(2001).getZIP());
	}

	@Test
	@DisplayName("Record 2002: Phone is 559-638-7181")
	void PhoneOfRecord2002() {
		assertEquals("559-638-7181", customers.get(2001).getPhone());
	}

	@Test
	@DisplayName("Record 2002: Fax is 559-638-4619")
	void FaxOfRecord2002() {
		assertEquals("559-638-4619", customers.get(2001).getFax());
	}

	@Test
	@DisplayName("Record 2002: Email is renae@scharbrough.com")
	void EmailOfRecord2002() {
		assertEquals("renae@scharbrough.com", customers.get(2001).getEmail());
	}

	@Test
	@DisplayName("Record 2002: Web is http://www.renaescharbrough.com")
	void WebOfRecord2002() {
		assertEquals("http://www.renaescharbrough.com", customers.get(2001).getWeb());
	}
}
