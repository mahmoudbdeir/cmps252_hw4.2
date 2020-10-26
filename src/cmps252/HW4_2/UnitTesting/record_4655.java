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
class Record_4655 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4655: FirstName is Antone")
	void FirstNameOfRecord4655() {
		assertEquals("Antone", customers.get(4654).getFirstName());
	}

	@Test
	@DisplayName("Record 4655: LastName is Betts")
	void LastNameOfRecord4655() {
		assertEquals("Betts", customers.get(4654).getLastName());
	}

	@Test
	@DisplayName("Record 4655: Company is Bell & Gaines")
	void CompanyOfRecord4655() {
		assertEquals("Bell & Gaines", customers.get(4654).getCompany());
	}

	@Test
	@DisplayName("Record 4655: Address is 1494 Hernando W")
	void AddressOfRecord4655() {
		assertEquals("1494 Hernando W", customers.get(4654).getAddress());
	}

	@Test
	@DisplayName("Record 4655: City is Brooksville")
	void CityOfRecord4655() {
		assertEquals("Brooksville", customers.get(4654).getCity());
	}

	@Test
	@DisplayName("Record 4655: County is Hernando")
	void CountyOfRecord4655() {
		assertEquals("Hernando", customers.get(4654).getCounty());
	}

	@Test
	@DisplayName("Record 4655: State is FL")
	void StateOfRecord4655() {
		assertEquals("FL", customers.get(4654).getState());
	}

	@Test
	@DisplayName("Record 4655: ZIP is 34601")
	void ZIPOfRecord4655() {
		assertEquals("34601", customers.get(4654).getZIP());
	}

	@Test
	@DisplayName("Record 4655: Phone is 352-688-2293")
	void PhoneOfRecord4655() {
		assertEquals("352-688-2293", customers.get(4654).getPhone());
	}

	@Test
	@DisplayName("Record 4655: Fax is 352-688-1403")
	void FaxOfRecord4655() {
		assertEquals("352-688-1403", customers.get(4654).getFax());
	}

	@Test
	@DisplayName("Record 4655: Email is antone@betts.com")
	void EmailOfRecord4655() {
		assertEquals("antone@betts.com", customers.get(4654).getEmail());
	}

	@Test
	@DisplayName("Record 4655: Web is http://www.antonebetts.com")
	void WebOfRecord4655() {
		assertEquals("http://www.antonebetts.com", customers.get(4654).getWeb());
	}
}
