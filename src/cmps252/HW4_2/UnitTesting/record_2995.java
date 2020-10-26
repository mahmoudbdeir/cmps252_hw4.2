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
class Record_2995 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2995: FirstName is June")
	void FirstNameOfRecord2995() {
		assertEquals("June", customers.get(2994).getFirstName());
	}

	@Test
	@DisplayName("Record 2995: LastName is Cance")
	void LastNameOfRecord2995() {
		assertEquals("Cance", customers.get(2994).getLastName());
	}

	@Test
	@DisplayName("Record 2995: Company is Heckeroth, Sally E Esq")
	void CompanyOfRecord2995() {
		assertEquals("Heckeroth, Sally E Esq", customers.get(2994).getCompany());
	}

	@Test
	@DisplayName("Record 2995: Address is 34 N Prince St")
	void AddressOfRecord2995() {
		assertEquals("34 N Prince St", customers.get(2994).getAddress());
	}

	@Test
	@DisplayName("Record 2995: City is Lancaster")
	void CityOfRecord2995() {
		assertEquals("Lancaster", customers.get(2994).getCity());
	}

	@Test
	@DisplayName("Record 2995: County is Lancaster")
	void CountyOfRecord2995() {
		assertEquals("Lancaster", customers.get(2994).getCounty());
	}

	@Test
	@DisplayName("Record 2995: State is PA")
	void StateOfRecord2995() {
		assertEquals("PA", customers.get(2994).getState());
	}

	@Test
	@DisplayName("Record 2995: ZIP is 17603")
	void ZIPOfRecord2995() {
		assertEquals("17603", customers.get(2994).getZIP());
	}

	@Test
	@DisplayName("Record 2995: Phone is 717-397-7037")
	void PhoneOfRecord2995() {
		assertEquals("717-397-7037", customers.get(2994).getPhone());
	}

	@Test
	@DisplayName("Record 2995: Fax is 717-397-2397")
	void FaxOfRecord2995() {
		assertEquals("717-397-2397", customers.get(2994).getFax());
	}

	@Test
	@DisplayName("Record 2995: Email is june@cance.com")
	void EmailOfRecord2995() {
		assertEquals("june@cance.com", customers.get(2994).getEmail());
	}

	@Test
	@DisplayName("Record 2995: Web is http://www.junecance.com")
	void WebOfRecord2995() {
		assertEquals("http://www.junecance.com", customers.get(2994).getWeb());
	}
}
