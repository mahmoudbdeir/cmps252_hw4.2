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

@Tag("30")
class Record_4483 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4483: FirstName is Carroll")
	void FirstNameOfRecord4483() {
		assertEquals("Carroll", customers.get(4482).getFirstName());
	}

	@Test
	@DisplayName("Record 4483: LastName is Sayle")
	void LastNameOfRecord4483() {
		assertEquals("Sayle", customers.get(4482).getLastName());
	}

	@Test
	@DisplayName("Record 4483: Company is Donahue, Richard K Jr")
	void CompanyOfRecord4483() {
		assertEquals("Donahue, Richard K Jr", customers.get(4482).getCompany());
	}

	@Test
	@DisplayName("Record 4483: Address is 787 Van Buren St  #-3")
	void AddressOfRecord4483() {
		assertEquals("787 Van Buren St  #-3", customers.get(4482).getAddress());
	}

	@Test
	@DisplayName("Record 4483: City is Eugene")
	void CityOfRecord4483() {
		assertEquals("Eugene", customers.get(4482).getCity());
	}

	@Test
	@DisplayName("Record 4483: County is Lane")
	void CountyOfRecord4483() {
		assertEquals("Lane", customers.get(4482).getCounty());
	}

	@Test
	@DisplayName("Record 4483: State is OR")
	void StateOfRecord4483() {
		assertEquals("OR", customers.get(4482).getState());
	}

	@Test
	@DisplayName("Record 4483: ZIP is 97402")
	void ZIPOfRecord4483() {
		assertEquals("97402", customers.get(4482).getZIP());
	}

	@Test
	@DisplayName("Record 4483: Phone is 541-683-5440")
	void PhoneOfRecord4483() {
		assertEquals("541-683-5440", customers.get(4482).getPhone());
	}

	@Test
	@DisplayName("Record 4483: Fax is 541-683-1109")
	void FaxOfRecord4483() {
		assertEquals("541-683-1109", customers.get(4482).getFax());
	}

	@Test
	@DisplayName("Record 4483: Email is carroll@sayle.com")
	void EmailOfRecord4483() {
		assertEquals("carroll@sayle.com", customers.get(4482).getEmail());
	}

	@Test
	@DisplayName("Record 4483: Web is http://www.carrollsayle.com")
	void WebOfRecord4483() {
		assertEquals("http://www.carrollsayle.com", customers.get(4482).getWeb());
	}
}
