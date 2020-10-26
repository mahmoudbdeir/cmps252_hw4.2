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

@Tag("21")
class Record_3886 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3886: FirstName is Lillian")
	void FirstNameOfRecord3886() {
		assertEquals("Lillian", customers.get(3885).getFirstName());
	}

	@Test
	@DisplayName("Record 3886: LastName is Gonnerman")
	void LastNameOfRecord3886() {
		assertEquals("Gonnerman", customers.get(3885).getLastName());
	}

	@Test
	@DisplayName("Record 3886: Company is Michael Stevens Ltd")
	void CompanyOfRecord3886() {
		assertEquals("Michael Stevens Ltd", customers.get(3885).getCompany());
	}

	@Test
	@DisplayName("Record 3886: Address is 7700 Wisconsin Ave")
	void AddressOfRecord3886() {
		assertEquals("7700 Wisconsin Ave", customers.get(3885).getAddress());
	}

	@Test
	@DisplayName("Record 3886: City is Bethesda")
	void CityOfRecord3886() {
		assertEquals("Bethesda", customers.get(3885).getCity());
	}

	@Test
	@DisplayName("Record 3886: County is Montgomery")
	void CountyOfRecord3886() {
		assertEquals("Montgomery", customers.get(3885).getCounty());
	}

	@Test
	@DisplayName("Record 3886: State is MD")
	void StateOfRecord3886() {
		assertEquals("MD", customers.get(3885).getState());
	}

	@Test
	@DisplayName("Record 3886: ZIP is 20814")
	void ZIPOfRecord3886() {
		assertEquals("20814", customers.get(3885).getZIP());
	}

	@Test
	@DisplayName("Record 3886: Phone is 301-657-4282")
	void PhoneOfRecord3886() {
		assertEquals("301-657-4282", customers.get(3885).getPhone());
	}

	@Test
	@DisplayName("Record 3886: Fax is 301-657-9597")
	void FaxOfRecord3886() {
		assertEquals("301-657-9597", customers.get(3885).getFax());
	}

	@Test
	@DisplayName("Record 3886: Email is lillian@gonnerman.com")
	void EmailOfRecord3886() {
		assertEquals("lillian@gonnerman.com", customers.get(3885).getEmail());
	}

	@Test
	@DisplayName("Record 3886: Web is http://www.lilliangonnerman.com")
	void WebOfRecord3886() {
		assertEquals("http://www.lilliangonnerman.com", customers.get(3885).getWeb());
	}
}
