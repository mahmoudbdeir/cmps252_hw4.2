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

@Tag("31")
class Record_3671 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3671: FirstName is Devin")
	void FirstNameOfRecord3671() {
		assertEquals("Devin", customers.get(3670).getFirstName());
	}

	@Test
	@DisplayName("Record 3671: LastName is Casciano")
	void LastNameOfRecord3671() {
		assertEquals("Casciano", customers.get(3670).getLastName());
	}

	@Test
	@DisplayName("Record 3671: Company is Ellsworth, Robert J Esq")
	void CompanyOfRecord3671() {
		assertEquals("Ellsworth, Robert J Esq", customers.get(3670).getCompany());
	}

	@Test
	@DisplayName("Record 3671: Address is 1401 Landmyer Rd")
	void AddressOfRecord3671() {
		assertEquals("1401 Landmyer Rd", customers.get(3670).getAddress());
	}

	@Test
	@DisplayName("Record 3671: City is Elk Grove Village")
	void CityOfRecord3671() {
		assertEquals("Elk Grove Village", customers.get(3670).getCity());
	}

	@Test
	@DisplayName("Record 3671: County is Cook")
	void CountyOfRecord3671() {
		assertEquals("Cook", customers.get(3670).getCounty());
	}

	@Test
	@DisplayName("Record 3671: State is IL")
	void StateOfRecord3671() {
		assertEquals("IL", customers.get(3670).getState());
	}

	@Test
	@DisplayName("Record 3671: ZIP is 60007")
	void ZIPOfRecord3671() {
		assertEquals("60007", customers.get(3670).getZIP());
	}

	@Test
	@DisplayName("Record 3671: Phone is 847-364-3094")
	void PhoneOfRecord3671() {
		assertEquals("847-364-3094", customers.get(3670).getPhone());
	}

	@Test
	@DisplayName("Record 3671: Fax is 847-364-9789")
	void FaxOfRecord3671() {
		assertEquals("847-364-9789", customers.get(3670).getFax());
	}

	@Test
	@DisplayName("Record 3671: Email is devin@casciano.com")
	void EmailOfRecord3671() {
		assertEquals("devin@casciano.com", customers.get(3670).getEmail());
	}

	@Test
	@DisplayName("Record 3671: Web is http://www.devincasciano.com")
	void WebOfRecord3671() {
		assertEquals("http://www.devincasciano.com", customers.get(3670).getWeb());
	}
}
