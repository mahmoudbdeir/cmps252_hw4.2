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

@Tag("39")
class Record_1292 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1292: FirstName is Lenny")
	void FirstNameOfRecord1292() {
		assertEquals("Lenny", customers.get(1291).getFirstName());
	}

	@Test
	@DisplayName("Record 1292: LastName is Meharg")
	void LastNameOfRecord1292() {
		assertEquals("Meharg", customers.get(1291).getLastName());
	}

	@Test
	@DisplayName("Record 1292: Company is Middlesex Screw Machine")
	void CompanyOfRecord1292() {
		assertEquals("Middlesex Screw Machine", customers.get(1291).getCompany());
	}

	@Test
	@DisplayName("Record 1292: Address is 1 Madison Ave")
	void AddressOfRecord1292() {
		assertEquals("1 Madison Ave", customers.get(1291).getAddress());
	}

	@Test
	@DisplayName("Record 1292: City is Morristown")
	void CityOfRecord1292() {
		assertEquals("Morristown", customers.get(1291).getCity());
	}

	@Test
	@DisplayName("Record 1292: County is Morris")
	void CountyOfRecord1292() {
		assertEquals("Morris", customers.get(1291).getCounty());
	}

	@Test
	@DisplayName("Record 1292: State is NJ")
	void StateOfRecord1292() {
		assertEquals("NJ", customers.get(1291).getState());
	}

	@Test
	@DisplayName("Record 1292: ZIP is 7960")
	void ZIPOfRecord1292() {
		assertEquals("7960", customers.get(1291).getZIP());
	}

	@Test
	@DisplayName("Record 1292: Phone is 973-879-7414")
	void PhoneOfRecord1292() {
		assertEquals("973-879-7414", customers.get(1291).getPhone());
	}

	@Test
	@DisplayName("Record 1292: Fax is 973-879-8345")
	void FaxOfRecord1292() {
		assertEquals("973-879-8345", customers.get(1291).getFax());
	}

	@Test
	@DisplayName("Record 1292: Email is lenny@meharg.com")
	void EmailOfRecord1292() {
		assertEquals("lenny@meharg.com", customers.get(1291).getEmail());
	}

	@Test
	@DisplayName("Record 1292: Web is http://www.lennymeharg.com")
	void WebOfRecord1292() {
		assertEquals("http://www.lennymeharg.com", customers.get(1291).getWeb());
	}
}
