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

@Tag("19")
class Record_4540 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4540: FirstName is Verda")
	void FirstNameOfRecord4540() {
		assertEquals("Verda", customers.get(4539).getFirstName());
	}

	@Test
	@DisplayName("Record 4540: LastName is Silkenson")
	void LastNameOfRecord4540() {
		assertEquals("Silkenson", customers.get(4539).getLastName());
	}

	@Test
	@DisplayName("Record 4540: Company is Jones, Mark C Md")
	void CompanyOfRecord4540() {
		assertEquals("Jones, Mark C Md", customers.get(4539).getCompany());
	}

	@Test
	@DisplayName("Record 4540: Address is 170 Higbie Ln")
	void AddressOfRecord4540() {
		assertEquals("170 Higbie Ln", customers.get(4539).getAddress());
	}

	@Test
	@DisplayName("Record 4540: City is West Islip")
	void CityOfRecord4540() {
		assertEquals("West Islip", customers.get(4539).getCity());
	}

	@Test
	@DisplayName("Record 4540: County is Suffolk")
	void CountyOfRecord4540() {
		assertEquals("Suffolk", customers.get(4539).getCounty());
	}

	@Test
	@DisplayName("Record 4540: State is NY")
	void StateOfRecord4540() {
		assertEquals("NY", customers.get(4539).getState());
	}

	@Test
	@DisplayName("Record 4540: ZIP is 11795")
	void ZIPOfRecord4540() {
		assertEquals("11795", customers.get(4539).getZIP());
	}

	@Test
	@DisplayName("Record 4540: Phone is 631-669-9192")
	void PhoneOfRecord4540() {
		assertEquals("631-669-9192", customers.get(4539).getPhone());
	}

	@Test
	@DisplayName("Record 4540: Fax is 631-669-7075")
	void FaxOfRecord4540() {
		assertEquals("631-669-7075", customers.get(4539).getFax());
	}

	@Test
	@DisplayName("Record 4540: Email is verda@silkenson.com")
	void EmailOfRecord4540() {
		assertEquals("verda@silkenson.com", customers.get(4539).getEmail());
	}

	@Test
	@DisplayName("Record 4540: Web is http://www.verdasilkenson.com")
	void WebOfRecord4540() {
		assertEquals("http://www.verdasilkenson.com", customers.get(4539).getWeb());
	}
}
