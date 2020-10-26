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

@Tag("9")
class Record_2263 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2263: FirstName is Cedric")
	void FirstNameOfRecord2263() {
		assertEquals("Cedric", customers.get(2262).getFirstName());
	}

	@Test
	@DisplayName("Record 2263: LastName is Yuscak")
	void LastNameOfRecord2263() {
		assertEquals("Yuscak", customers.get(2262).getLastName());
	}

	@Test
	@DisplayName("Record 2263: Company is Morgan Bro Manhattan Storage")
	void CompanyOfRecord2263() {
		assertEquals("Morgan Bro Manhattan Storage", customers.get(2262).getCompany());
	}

	@Test
	@DisplayName("Record 2263: Address is 330 Linden Ave")
	void AddressOfRecord2263() {
		assertEquals("330 Linden Ave", customers.get(2262).getAddress());
	}

	@Test
	@DisplayName("Record 2263: City is Hellertown")
	void CityOfRecord2263() {
		assertEquals("Hellertown", customers.get(2262).getCity());
	}

	@Test
	@DisplayName("Record 2263: County is Northampton")
	void CountyOfRecord2263() {
		assertEquals("Northampton", customers.get(2262).getCounty());
	}

	@Test
	@DisplayName("Record 2263: State is PA")
	void StateOfRecord2263() {
		assertEquals("PA", customers.get(2262).getState());
	}

	@Test
	@DisplayName("Record 2263: ZIP is 18055")
	void ZIPOfRecord2263() {
		assertEquals("18055", customers.get(2262).getZIP());
	}

	@Test
	@DisplayName("Record 2263: Phone is 610-838-0280")
	void PhoneOfRecord2263() {
		assertEquals("610-838-0280", customers.get(2262).getPhone());
	}

	@Test
	@DisplayName("Record 2263: Fax is 610-838-8424")
	void FaxOfRecord2263() {
		assertEquals("610-838-8424", customers.get(2262).getFax());
	}

	@Test
	@DisplayName("Record 2263: Email is cedric@yuscak.com")
	void EmailOfRecord2263() {
		assertEquals("cedric@yuscak.com", customers.get(2262).getEmail());
	}

	@Test
	@DisplayName("Record 2263: Web is http://www.cedricyuscak.com")
	void WebOfRecord2263() {
		assertEquals("http://www.cedricyuscak.com", customers.get(2262).getWeb());
	}
}
