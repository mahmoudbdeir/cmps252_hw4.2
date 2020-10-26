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

@Tag("42")
class Record_4587 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4587: FirstName is Malissa")
	void FirstNameOfRecord4587() {
		assertEquals("Malissa", customers.get(4586).getFirstName());
	}

	@Test
	@DisplayName("Record 4587: LastName is Smetak")
	void LastNameOfRecord4587() {
		assertEquals("Smetak", customers.get(4586).getLastName());
	}

	@Test
	@DisplayName("Record 4587: Company is Idea Showcase")
	void CompanyOfRecord4587() {
		assertEquals("Idea Showcase", customers.get(4586).getCompany());
	}

	@Test
	@DisplayName("Record 4587: Address is 3043 Monroe St")
	void AddressOfRecord4587() {
		assertEquals("3043 Monroe St", customers.get(4586).getAddress());
	}

	@Test
	@DisplayName("Record 4587: City is Toledo")
	void CityOfRecord4587() {
		assertEquals("Toledo", customers.get(4586).getCity());
	}

	@Test
	@DisplayName("Record 4587: County is Lucas")
	void CountyOfRecord4587() {
		assertEquals("Lucas", customers.get(4586).getCounty());
	}

	@Test
	@DisplayName("Record 4587: State is OH")
	void StateOfRecord4587() {
		assertEquals("OH", customers.get(4586).getState());
	}

	@Test
	@DisplayName("Record 4587: ZIP is 43606")
	void ZIPOfRecord4587() {
		assertEquals("43606", customers.get(4586).getZIP());
	}

	@Test
	@DisplayName("Record 4587: Phone is 419-243-7837")
	void PhoneOfRecord4587() {
		assertEquals("419-243-7837", customers.get(4586).getPhone());
	}

	@Test
	@DisplayName("Record 4587: Fax is 419-243-6767")
	void FaxOfRecord4587() {
		assertEquals("419-243-6767", customers.get(4586).getFax());
	}

	@Test
	@DisplayName("Record 4587: Email is malissa@smetak.com")
	void EmailOfRecord4587() {
		assertEquals("malissa@smetak.com", customers.get(4586).getEmail());
	}

	@Test
	@DisplayName("Record 4587: Web is http://www.malissasmetak.com")
	void WebOfRecord4587() {
		assertEquals("http://www.malissasmetak.com", customers.get(4586).getWeb());
	}
}
