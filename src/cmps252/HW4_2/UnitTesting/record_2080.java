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

@Tag("6")
class Record_2080 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2080: FirstName is Aline")
	void FirstNameOfRecord2080() {
		assertEquals("Aline", customers.get(2079).getFirstName());
	}

	@Test
	@DisplayName("Record 2080: LastName is Lugones")
	void LastNameOfRecord2080() {
		assertEquals("Lugones", customers.get(2079).getLastName());
	}

	@Test
	@DisplayName("Record 2080: Company is Germantown Hospital & Medl Ctr")
	void CompanyOfRecord2080() {
		assertEquals("Germantown Hospital & Medl Ctr", customers.get(2079).getCompany());
	}

	@Test
	@DisplayName("Record 2080: Address is 1220 Grand Ave")
	void AddressOfRecord2080() {
		assertEquals("1220 Grand Ave", customers.get(2079).getAddress());
	}

	@Test
	@DisplayName("Record 2080: City is Waukegan")
	void CityOfRecord2080() {
		assertEquals("Waukegan", customers.get(2079).getCity());
	}

	@Test
	@DisplayName("Record 2080: County is Lake")
	void CountyOfRecord2080() {
		assertEquals("Lake", customers.get(2079).getCounty());
	}

	@Test
	@DisplayName("Record 2080: State is IL")
	void StateOfRecord2080() {
		assertEquals("IL", customers.get(2079).getState());
	}

	@Test
	@DisplayName("Record 2080: ZIP is 60085")
	void ZIPOfRecord2080() {
		assertEquals("60085", customers.get(2079).getZIP());
	}

	@Test
	@DisplayName("Record 2080: Phone is 847-336-3188")
	void PhoneOfRecord2080() {
		assertEquals("847-336-3188", customers.get(2079).getPhone());
	}

	@Test
	@DisplayName("Record 2080: Fax is 847-336-6136")
	void FaxOfRecord2080() {
		assertEquals("847-336-6136", customers.get(2079).getFax());
	}

	@Test
	@DisplayName("Record 2080: Email is aline@lugones.com")
	void EmailOfRecord2080() {
		assertEquals("aline@lugones.com", customers.get(2079).getEmail());
	}

	@Test
	@DisplayName("Record 2080: Web is http://www.alinelugones.com")
	void WebOfRecord2080() {
		assertEquals("http://www.alinelugones.com", customers.get(2079).getWeb());
	}
}
