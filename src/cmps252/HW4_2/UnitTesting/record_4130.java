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

@Tag("6")
class Record_4130 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4130: FirstName is Broderick")
	void FirstNameOfRecord4130() {
		assertEquals("Broderick", customers.get(4129).getFirstName());
	}

	@Test
	@DisplayName("Record 4130: LastName is Kardux")
	void LastNameOfRecord4130() {
		assertEquals("Kardux", customers.get(4129).getLastName());
	}

	@Test
	@DisplayName("Record 4130: Company is Neptune Research & Dev Inc")
	void CompanyOfRecord4130() {
		assertEquals("Neptune Research & Dev Inc", customers.get(4129).getCompany());
	}

	@Test
	@DisplayName("Record 4130: Address is 1023 E 13th St")
	void AddressOfRecord4130() {
		assertEquals("1023 E 13th St", customers.get(4129).getAddress());
	}

	@Test
	@DisplayName("Record 4130: City is Bowling Green")
	void CityOfRecord4130() {
		assertEquals("Bowling Green", customers.get(4129).getCity());
	}

	@Test
	@DisplayName("Record 4130: County is Warren")
	void CountyOfRecord4130() {
		assertEquals("Warren", customers.get(4129).getCounty());
	}

	@Test
	@DisplayName("Record 4130: State is KY")
	void StateOfRecord4130() {
		assertEquals("KY", customers.get(4129).getState());
	}

	@Test
	@DisplayName("Record 4130: ZIP is 42104")
	void ZIPOfRecord4130() {
		assertEquals("42104", customers.get(4129).getZIP());
	}

	@Test
	@DisplayName("Record 4130: Phone is 270-781-5377")
	void PhoneOfRecord4130() {
		assertEquals("270-781-5377", customers.get(4129).getPhone());
	}

	@Test
	@DisplayName("Record 4130: Fax is 270-781-3088")
	void FaxOfRecord4130() {
		assertEquals("270-781-3088", customers.get(4129).getFax());
	}

	@Test
	@DisplayName("Record 4130: Email is broderick@kardux.com")
	void EmailOfRecord4130() {
		assertEquals("broderick@kardux.com", customers.get(4129).getEmail());
	}

	@Test
	@DisplayName("Record 4130: Web is http://www.broderickkardux.com")
	void WebOfRecord4130() {
		assertEquals("http://www.broderickkardux.com", customers.get(4129).getWeb());
	}
}
