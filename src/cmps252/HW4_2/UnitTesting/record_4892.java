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
class Record_4892 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4892: FirstName is Stacey")
	void FirstNameOfRecord4892() {
		assertEquals("Stacey", customers.get(4891).getFirstName());
	}

	@Test
	@DisplayName("Record 4892: LastName is Katsberg")
	void LastNameOfRecord4892() {
		assertEquals("Katsberg", customers.get(4891).getLastName());
	}

	@Test
	@DisplayName("Record 4892: Company is Cabrillo Mechl & Sht Metl Inc")
	void CompanyOfRecord4892() {
		assertEquals("Cabrillo Mechl & Sht Metl Inc", customers.get(4891).getCompany());
	}

	@Test
	@DisplayName("Record 4892: Address is 530 Amboy Ave")
	void AddressOfRecord4892() {
		assertEquals("530 Amboy Ave", customers.get(4891).getAddress());
	}

	@Test
	@DisplayName("Record 4892: City is Woodbridge")
	void CityOfRecord4892() {
		assertEquals("Woodbridge", customers.get(4891).getCity());
	}

	@Test
	@DisplayName("Record 4892: County is Middlesex")
	void CountyOfRecord4892() {
		assertEquals("Middlesex", customers.get(4891).getCounty());
	}

	@Test
	@DisplayName("Record 4892: State is NJ")
	void StateOfRecord4892() {
		assertEquals("NJ", customers.get(4891).getState());
	}

	@Test
	@DisplayName("Record 4892: ZIP is 7095")
	void ZIPOfRecord4892() {
		assertEquals("7095", customers.get(4891).getZIP());
	}

	@Test
	@DisplayName("Record 4892: Phone is 732-636-4205")
	void PhoneOfRecord4892() {
		assertEquals("732-636-4205", customers.get(4891).getPhone());
	}

	@Test
	@DisplayName("Record 4892: Fax is 732-636-3743")
	void FaxOfRecord4892() {
		assertEquals("732-636-3743", customers.get(4891).getFax());
	}

	@Test
	@DisplayName("Record 4892: Email is stacey@katsberg.com")
	void EmailOfRecord4892() {
		assertEquals("stacey@katsberg.com", customers.get(4891).getEmail());
	}

	@Test
	@DisplayName("Record 4892: Web is http://www.staceykatsberg.com")
	void WebOfRecord4892() {
		assertEquals("http://www.staceykatsberg.com", customers.get(4891).getWeb());
	}
}
