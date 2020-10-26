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

@Tag("4")
class Record_4509 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4509: FirstName is Maynard")
	void FirstNameOfRecord4509() {
		assertEquals("Maynard", customers.get(4508).getFirstName());
	}

	@Test
	@DisplayName("Record 4509: LastName is Demshar")
	void LastNameOfRecord4509() {
		assertEquals("Demshar", customers.get(4508).getLastName());
	}

	@Test
	@DisplayName("Record 4509: Company is Davidson, Kyth L Esq")
	void CompanyOfRecord4509() {
		assertEquals("Davidson, Kyth L Esq", customers.get(4508).getCompany());
	}

	@Test
	@DisplayName("Record 4509: Address is 1911 Pennsylvania Ave")
	void AddressOfRecord4509() {
		assertEquals("1911 Pennsylvania Ave", customers.get(4508).getAddress());
	}

	@Test
	@DisplayName("Record 4509: City is Croydon")
	void CityOfRecord4509() {
		assertEquals("Croydon", customers.get(4508).getCity());
	}

	@Test
	@DisplayName("Record 4509: County is Bucks")
	void CountyOfRecord4509() {
		assertEquals("Bucks", customers.get(4508).getCounty());
	}

	@Test
	@DisplayName("Record 4509: State is PA")
	void StateOfRecord4509() {
		assertEquals("PA", customers.get(4508).getState());
	}

	@Test
	@DisplayName("Record 4509: ZIP is 19021")
	void ZIPOfRecord4509() {
		assertEquals("19021", customers.get(4508).getZIP());
	}

	@Test
	@DisplayName("Record 4509: Phone is 215-788-5035")
	void PhoneOfRecord4509() {
		assertEquals("215-788-5035", customers.get(4508).getPhone());
	}

	@Test
	@DisplayName("Record 4509: Fax is 215-788-6136")
	void FaxOfRecord4509() {
		assertEquals("215-788-6136", customers.get(4508).getFax());
	}

	@Test
	@DisplayName("Record 4509: Email is maynard@demshar.com")
	void EmailOfRecord4509() {
		assertEquals("maynard@demshar.com", customers.get(4508).getEmail());
	}

	@Test
	@DisplayName("Record 4509: Web is http://www.maynarddemshar.com")
	void WebOfRecord4509() {
		assertEquals("http://www.maynarddemshar.com", customers.get(4508).getWeb());
	}
}
