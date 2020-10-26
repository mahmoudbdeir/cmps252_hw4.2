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
class Record_2911 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2911: FirstName is Guillermo")
	void FirstNameOfRecord2911() {
		assertEquals("Guillermo", customers.get(2910).getFirstName());
	}

	@Test
	@DisplayName("Record 2911: LastName is Shabala")
	void LastNameOfRecord2911() {
		assertEquals("Shabala", customers.get(2910).getLastName());
	}

	@Test
	@DisplayName("Record 2911: Company is Queen Cy Cndy Tob & Vndng Inc")
	void CompanyOfRecord2911() {
		assertEquals("Queen Cy Cndy Tob & Vndng Inc", customers.get(2910).getCompany());
	}

	@Test
	@DisplayName("Record 2911: Address is 1972 Wales Rd Ne")
	void AddressOfRecord2911() {
		assertEquals("1972 Wales Rd Ne", customers.get(2910).getAddress());
	}

	@Test
	@DisplayName("Record 2911: City is Massillon")
	void CityOfRecord2911() {
		assertEquals("Massillon", customers.get(2910).getCity());
	}

	@Test
	@DisplayName("Record 2911: County is Stark")
	void CountyOfRecord2911() {
		assertEquals("Stark", customers.get(2910).getCounty());
	}

	@Test
	@DisplayName("Record 2911: State is OH")
	void StateOfRecord2911() {
		assertEquals("OH", customers.get(2910).getState());
	}

	@Test
	@DisplayName("Record 2911: ZIP is 44646")
	void ZIPOfRecord2911() {
		assertEquals("44646", customers.get(2910).getZIP());
	}

	@Test
	@DisplayName("Record 2911: Phone is 330-833-9231")
	void PhoneOfRecord2911() {
		assertEquals("330-833-9231", customers.get(2910).getPhone());
	}

	@Test
	@DisplayName("Record 2911: Fax is 330-833-6544")
	void FaxOfRecord2911() {
		assertEquals("330-833-6544", customers.get(2910).getFax());
	}

	@Test
	@DisplayName("Record 2911: Email is guillermo@shabala.com")
	void EmailOfRecord2911() {
		assertEquals("guillermo@shabala.com", customers.get(2910).getEmail());
	}

	@Test
	@DisplayName("Record 2911: Web is http://www.guillermoshabala.com")
	void WebOfRecord2911() {
		assertEquals("http://www.guillermoshabala.com", customers.get(2910).getWeb());
	}
}
