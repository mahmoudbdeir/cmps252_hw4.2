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

@Tag("20")
class Record_4603 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4603: FirstName is Kitty")
	void FirstNameOfRecord4603() {
		assertEquals("Kitty", customers.get(4602).getFirstName());
	}

	@Test
	@DisplayName("Record 4603: LastName is Pellham")
	void LastNameOfRecord4603() {
		assertEquals("Pellham", customers.get(4602).getLastName());
	}

	@Test
	@DisplayName("Record 4603: Company is Ellenburg Painting")
	void CompanyOfRecord4603() {
		assertEquals("Ellenburg Painting", customers.get(4602).getCompany());
	}

	@Test
	@DisplayName("Record 4603: Address is 320 W Grand Ave")
	void AddressOfRecord4603() {
		assertEquals("320 W Grand Ave", customers.get(4602).getAddress());
	}

	@Test
	@DisplayName("Record 4603: City is Dayton")
	void CityOfRecord4603() {
		assertEquals("Dayton", customers.get(4602).getCity());
	}

	@Test
	@DisplayName("Record 4603: County is Montgomery")
	void CountyOfRecord4603() {
		assertEquals("Montgomery", customers.get(4602).getCounty());
	}

	@Test
	@DisplayName("Record 4603: State is OH")
	void StateOfRecord4603() {
		assertEquals("OH", customers.get(4602).getState());
	}

	@Test
	@DisplayName("Record 4603: ZIP is 45405")
	void ZIPOfRecord4603() {
		assertEquals("45405", customers.get(4602).getZIP());
	}

	@Test
	@DisplayName("Record 4603: Phone is 937-461-2023")
	void PhoneOfRecord4603() {
		assertEquals("937-461-2023", customers.get(4602).getPhone());
	}

	@Test
	@DisplayName("Record 4603: Fax is 937-461-2049")
	void FaxOfRecord4603() {
		assertEquals("937-461-2049", customers.get(4602).getFax());
	}

	@Test
	@DisplayName("Record 4603: Email is kitty@pellham.com")
	void EmailOfRecord4603() {
		assertEquals("kitty@pellham.com", customers.get(4602).getEmail());
	}

	@Test
	@DisplayName("Record 4603: Web is http://www.kittypellham.com")
	void WebOfRecord4603() {
		assertEquals("http://www.kittypellham.com", customers.get(4602).getWeb());
	}
}
