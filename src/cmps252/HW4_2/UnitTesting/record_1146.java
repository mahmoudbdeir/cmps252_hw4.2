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

@Tag("10")
class Record_1146 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1146: FirstName is Jackie")
	void FirstNameOfRecord1146() {
		assertEquals("Jackie", customers.get(1145).getFirstName());
	}

	@Test
	@DisplayName("Record 1146: LastName is Abdel")
	void LastNameOfRecord1146() {
		assertEquals("Abdel", customers.get(1145).getLastName());
	}

	@Test
	@DisplayName("Record 1146: Company is R H Dunn & Associates Inc")
	void CompanyOfRecord1146() {
		assertEquals("R H Dunn & Associates Inc", customers.get(1145).getCompany());
	}

	@Test
	@DisplayName("Record 1146: Address is 3939 N 48th St")
	void AddressOfRecord1146() {
		assertEquals("3939 N 48th St", customers.get(1145).getAddress());
	}

	@Test
	@DisplayName("Record 1146: City is Lincoln")
	void CityOfRecord1146() {
		assertEquals("Lincoln", customers.get(1145).getCity());
	}

	@Test
	@DisplayName("Record 1146: County is Lancaster")
	void CountyOfRecord1146() {
		assertEquals("Lancaster", customers.get(1145).getCounty());
	}

	@Test
	@DisplayName("Record 1146: State is NE")
	void StateOfRecord1146() {
		assertEquals("NE", customers.get(1145).getState());
	}

	@Test
	@DisplayName("Record 1146: ZIP is 68504")
	void ZIPOfRecord1146() {
		assertEquals("68504", customers.get(1145).getZIP());
	}

	@Test
	@DisplayName("Record 1146: Phone is 402-464-4354")
	void PhoneOfRecord1146() {
		assertEquals("402-464-4354", customers.get(1145).getPhone());
	}

	@Test
	@DisplayName("Record 1146: Fax is 402-464-7925")
	void FaxOfRecord1146() {
		assertEquals("402-464-7925", customers.get(1145).getFax());
	}

	@Test
	@DisplayName("Record 1146: Email is jackie@abdel.com")
	void EmailOfRecord1146() {
		assertEquals("jackie@abdel.com", customers.get(1145).getEmail());
	}

	@Test
	@DisplayName("Record 1146: Web is http://www.jackieabdel.com")
	void WebOfRecord1146() {
		assertEquals("http://www.jackieabdel.com", customers.get(1145).getWeb());
	}
}
