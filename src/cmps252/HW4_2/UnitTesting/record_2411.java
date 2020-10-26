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

@Tag("26")
class Record_2411 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2411: FirstName is Tiffany")
	void FirstNameOfRecord2411() {
		assertEquals("Tiffany", customers.get(2410).getFirstName());
	}

	@Test
	@DisplayName("Record 2411: LastName is Bernoski")
	void LastNameOfRecord2411() {
		assertEquals("Bernoski", customers.get(2410).getLastName());
	}

	@Test
	@DisplayName("Record 2411: Company is Bob Herzkowits & Sons Inc")
	void CompanyOfRecord2411() {
		assertEquals("Bob Herzkowits & Sons Inc", customers.get(2410).getCompany());
	}

	@Test
	@DisplayName("Record 2411: Address is 17611 Broadway Ave")
	void AddressOfRecord2411() {
		assertEquals("17611 Broadway Ave", customers.get(2410).getAddress());
	}

	@Test
	@DisplayName("Record 2411: City is Maple Hyghts")
	void CityOfRecord2411() {
		assertEquals("Maple Hyghts", customers.get(2410).getCity());
	}

	@Test
	@DisplayName("Record 2411: County is Cuyahoga")
	void CountyOfRecord2411() {
		assertEquals("Cuyahoga", customers.get(2410).getCounty());
	}

	@Test
	@DisplayName("Record 2411: State is OH")
	void StateOfRecord2411() {
		assertEquals("OH", customers.get(2410).getState());
	}

	@Test
	@DisplayName("Record 2411: ZIP is 44137")
	void ZIPOfRecord2411() {
		assertEquals("44137", customers.get(2410).getZIP());
	}

	@Test
	@DisplayName("Record 2411: Phone is 216-587-0030")
	void PhoneOfRecord2411() {
		assertEquals("216-587-0030", customers.get(2410).getPhone());
	}

	@Test
	@DisplayName("Record 2411: Fax is 216-587-3739")
	void FaxOfRecord2411() {
		assertEquals("216-587-3739", customers.get(2410).getFax());
	}

	@Test
	@DisplayName("Record 2411: Email is tiffany@bernoski.com")
	void EmailOfRecord2411() {
		assertEquals("tiffany@bernoski.com", customers.get(2410).getEmail());
	}

	@Test
	@DisplayName("Record 2411: Web is http://www.tiffanybernoski.com")
	void WebOfRecord2411() {
		assertEquals("http://www.tiffanybernoski.com", customers.get(2410).getWeb());
	}
}
