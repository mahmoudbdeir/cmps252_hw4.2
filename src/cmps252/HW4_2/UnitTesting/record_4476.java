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

@Tag("24")
class Record_4476 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4476: FirstName is Julie")
	void FirstNameOfRecord4476() {
		assertEquals("Julie", customers.get(4475).getFirstName());
	}

	@Test
	@DisplayName("Record 4476: LastName is Feagan")
	void LastNameOfRecord4476() {
		assertEquals("Feagan", customers.get(4475).getLastName());
	}

	@Test
	@DisplayName("Record 4476: Company is Texas Cnfrnc Cath Hlth Facil")
	void CompanyOfRecord4476() {
		assertEquals("Texas Cnfrnc Cath Hlth Facil", customers.get(4475).getCompany());
	}

	@Test
	@DisplayName("Record 4476: Address is 1024 Mcbride Ave")
	void AddressOfRecord4476() {
		assertEquals("1024 Mcbride Ave", customers.get(4475).getAddress());
	}

	@Test
	@DisplayName("Record 4476: City is Little Falls")
	void CityOfRecord4476() {
		assertEquals("Little Falls", customers.get(4475).getCity());
	}

	@Test
	@DisplayName("Record 4476: County is Passaic")
	void CountyOfRecord4476() {
		assertEquals("Passaic", customers.get(4475).getCounty());
	}

	@Test
	@DisplayName("Record 4476: State is NJ")
	void StateOfRecord4476() {
		assertEquals("NJ", customers.get(4475).getState());
	}

	@Test
	@DisplayName("Record 4476: ZIP is 07424")
	void ZIPOfRecord4476() {
		assertEquals("07424", customers.get(4475).getZIP());
	}

	@Test
	@DisplayName("Record 4476: Phone is 973-256-9567")
	void PhoneOfRecord4476() {
		assertEquals("973-256-9567", customers.get(4475).getPhone());
	}

	@Test
	@DisplayName("Record 4476: Fax is 973-256-0528")
	void FaxOfRecord4476() {
		assertEquals("973-256-0528", customers.get(4475).getFax());
	}

	@Test
	@DisplayName("Record 4476: Email is julie@feagan.com")
	void EmailOfRecord4476() {
		assertEquals("julie@feagan.com", customers.get(4475).getEmail());
	}

	@Test
	@DisplayName("Record 4476: Web is http://www.juliefeagan.com")
	void WebOfRecord4476() {
		assertEquals("http://www.juliefeagan.com", customers.get(4475).getWeb());
	}
}
