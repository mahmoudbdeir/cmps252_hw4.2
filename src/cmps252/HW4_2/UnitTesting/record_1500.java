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
class Record_1500 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1500: FirstName is Jasper")
	void FirstNameOfRecord1500() {
		assertEquals("Jasper", customers.get(1499).getFirstName());
	}

	@Test
	@DisplayName("Record 1500: LastName is Rhoney")
	void LastNameOfRecord1500() {
		assertEquals("Rhoney", customers.get(1499).getLastName());
	}

	@Test
	@DisplayName("Record 1500: Company is Burke, Nan E Esq")
	void CompanyOfRecord1500() {
		assertEquals("Burke, Nan E Esq", customers.get(1499).getCompany());
	}

	@Test
	@DisplayName("Record 1500: Address is 675 Trabold Rd")
	void AddressOfRecord1500() {
		assertEquals("675 Trabold Rd", customers.get(1499).getAddress());
	}

	@Test
	@DisplayName("Record 1500: City is Rochester")
	void CityOfRecord1500() {
		assertEquals("Rochester", customers.get(1499).getCity());
	}

	@Test
	@DisplayName("Record 1500: County is Monroe")
	void CountyOfRecord1500() {
		assertEquals("Monroe", customers.get(1499).getCounty());
	}

	@Test
	@DisplayName("Record 1500: State is NY")
	void StateOfRecord1500() {
		assertEquals("NY", customers.get(1499).getState());
	}

	@Test
	@DisplayName("Record 1500: ZIP is 14624")
	void ZIPOfRecord1500() {
		assertEquals("14624", customers.get(1499).getZIP());
	}

	@Test
	@DisplayName("Record 1500: Phone is 585-889-4670")
	void PhoneOfRecord1500() {
		assertEquals("585-889-4670", customers.get(1499).getPhone());
	}

	@Test
	@DisplayName("Record 1500: Fax is 585-889-4576")
	void FaxOfRecord1500() {
		assertEquals("585-889-4576", customers.get(1499).getFax());
	}

	@Test
	@DisplayName("Record 1500: Email is jasper@rhoney.com")
	void EmailOfRecord1500() {
		assertEquals("jasper@rhoney.com", customers.get(1499).getEmail());
	}

	@Test
	@DisplayName("Record 1500: Web is http://www.jasperrhoney.com")
	void WebOfRecord1500() {
		assertEquals("http://www.jasperrhoney.com", customers.get(1499).getWeb());
	}
}
