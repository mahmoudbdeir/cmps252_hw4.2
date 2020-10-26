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

@Tag("46")
class Record_4278 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4278: FirstName is Madonna")
	void FirstNameOfRecord4278() {
		assertEquals("Madonna", customers.get(4277).getFirstName());
	}

	@Test
	@DisplayName("Record 4278: LastName is Kuzmin")
	void LastNameOfRecord4278() {
		assertEquals("Kuzmin", customers.get(4277).getLastName());
	}

	@Test
	@DisplayName("Record 4278: Company is Harrell, Charles C Esq")
	void CompanyOfRecord4278() {
		assertEquals("Harrell, Charles C Esq", customers.get(4277).getCompany());
	}

	@Test
	@DisplayName("Record 4278: Address is 8712 W Dodge Rd")
	void AddressOfRecord4278() {
		assertEquals("8712 W Dodge Rd", customers.get(4277).getAddress());
	}

	@Test
	@DisplayName("Record 4278: City is Omaha")
	void CityOfRecord4278() {
		assertEquals("Omaha", customers.get(4277).getCity());
	}

	@Test
	@DisplayName("Record 4278: County is Douglas")
	void CountyOfRecord4278() {
		assertEquals("Douglas", customers.get(4277).getCounty());
	}

	@Test
	@DisplayName("Record 4278: State is NE")
	void StateOfRecord4278() {
		assertEquals("NE", customers.get(4277).getState());
	}

	@Test
	@DisplayName("Record 4278: ZIP is 68114")
	void ZIPOfRecord4278() {
		assertEquals("68114", customers.get(4277).getZIP());
	}

	@Test
	@DisplayName("Record 4278: Phone is 402-392-0490")
	void PhoneOfRecord4278() {
		assertEquals("402-392-0490", customers.get(4277).getPhone());
	}

	@Test
	@DisplayName("Record 4278: Fax is 402-392-6881")
	void FaxOfRecord4278() {
		assertEquals("402-392-6881", customers.get(4277).getFax());
	}

	@Test
	@DisplayName("Record 4278: Email is madonna@kuzmin.com")
	void EmailOfRecord4278() {
		assertEquals("madonna@kuzmin.com", customers.get(4277).getEmail());
	}

	@Test
	@DisplayName("Record 4278: Web is http://www.madonnakuzmin.com")
	void WebOfRecord4278() {
		assertEquals("http://www.madonnakuzmin.com", customers.get(4277).getWeb());
	}
}
