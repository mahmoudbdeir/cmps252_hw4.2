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

@Tag("21")
class Record_4860 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4860: FirstName is Weldon")
	void FirstNameOfRecord4860() {
		assertEquals("Weldon", customers.get(4859).getFirstName());
	}

	@Test
	@DisplayName("Record 4860: LastName is Rong")
	void LastNameOfRecord4860() {
		assertEquals("Rong", customers.get(4859).getLastName());
	}

	@Test
	@DisplayName("Record 4860: Company is Furches, S W Cpa")
	void CompanyOfRecord4860() {
		assertEquals("Furches, S W Cpa", customers.get(4859).getCompany());
	}

	@Test
	@DisplayName("Record 4860: Address is 941 O Terminal Bldg  #-109")
	void AddressOfRecord4860() {
		assertEquals("941 O Terminal Bldg  #-109", customers.get(4859).getAddress());
	}

	@Test
	@DisplayName("Record 4860: City is Lincoln")
	void CityOfRecord4860() {
		assertEquals("Lincoln", customers.get(4859).getCity());
	}

	@Test
	@DisplayName("Record 4860: County is Lancaster")
	void CountyOfRecord4860() {
		assertEquals("Lancaster", customers.get(4859).getCounty());
	}

	@Test
	@DisplayName("Record 4860: State is NE")
	void StateOfRecord4860() {
		assertEquals("NE", customers.get(4859).getState());
	}

	@Test
	@DisplayName("Record 4860: ZIP is 68508")
	void ZIPOfRecord4860() {
		assertEquals("68508", customers.get(4859).getZIP());
	}

	@Test
	@DisplayName("Record 4860: Phone is 402-476-7667")
	void PhoneOfRecord4860() {
		assertEquals("402-476-7667", customers.get(4859).getPhone());
	}

	@Test
	@DisplayName("Record 4860: Fax is 402-476-4366")
	void FaxOfRecord4860() {
		assertEquals("402-476-4366", customers.get(4859).getFax());
	}

	@Test
	@DisplayName("Record 4860: Email is weldon@rong.com")
	void EmailOfRecord4860() {
		assertEquals("weldon@rong.com", customers.get(4859).getEmail());
	}

	@Test
	@DisplayName("Record 4860: Web is http://www.weldonrong.com")
	void WebOfRecord4860() {
		assertEquals("http://www.weldonrong.com", customers.get(4859).getWeb());
	}
}
