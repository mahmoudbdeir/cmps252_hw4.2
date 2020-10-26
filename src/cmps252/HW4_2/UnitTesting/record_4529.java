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

@Tag("14")
class Record_4529 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4529: FirstName is Rosie")
	void FirstNameOfRecord4529() {
		assertEquals("Rosie", customers.get(4528).getFirstName());
	}

	@Test
	@DisplayName("Record 4529: LastName is Sangster")
	void LastNameOfRecord4529() {
		assertEquals("Sangster", customers.get(4528).getLastName());
	}

	@Test
	@DisplayName("Record 4529: Company is Barrow Surveying & Mapping")
	void CompanyOfRecord4529() {
		assertEquals("Barrow Surveying & Mapping", customers.get(4528).getCompany());
	}

	@Test
	@DisplayName("Record 4529: Address is 4229 Lafayette Ave")
	void AddressOfRecord4529() {
		assertEquals("4229 Lafayette Ave", customers.get(4528).getAddress());
	}

	@Test
	@DisplayName("Record 4529: City is Omaha")
	void CityOfRecord4529() {
		assertEquals("Omaha", customers.get(4528).getCity());
	}

	@Test
	@DisplayName("Record 4529: County is Douglas")
	void CountyOfRecord4529() {
		assertEquals("Douglas", customers.get(4528).getCounty());
	}

	@Test
	@DisplayName("Record 4529: State is NE")
	void StateOfRecord4529() {
		assertEquals("NE", customers.get(4528).getState());
	}

	@Test
	@DisplayName("Record 4529: ZIP is 68131")
	void ZIPOfRecord4529() {
		assertEquals("68131", customers.get(4528).getZIP());
	}

	@Test
	@DisplayName("Record 4529: Phone is 402-556-7681")
	void PhoneOfRecord4529() {
		assertEquals("402-556-7681", customers.get(4528).getPhone());
	}

	@Test
	@DisplayName("Record 4529: Fax is 402-556-2902")
	void FaxOfRecord4529() {
		assertEquals("402-556-2902", customers.get(4528).getFax());
	}

	@Test
	@DisplayName("Record 4529: Email is rosie@sangster.com")
	void EmailOfRecord4529() {
		assertEquals("rosie@sangster.com", customers.get(4528).getEmail());
	}

	@Test
	@DisplayName("Record 4529: Web is http://www.rosiesangster.com")
	void WebOfRecord4529() {
		assertEquals("http://www.rosiesangster.com", customers.get(4528).getWeb());
	}
}
