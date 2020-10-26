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

@Tag("27")
class Record_4097 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4097: FirstName is Burton")
	void FirstNameOfRecord4097() {
		assertEquals("Burton", customers.get(4096).getFirstName());
	}

	@Test
	@DisplayName("Record 4097: LastName is Bozzone")
	void LastNameOfRecord4097() {
		assertEquals("Bozzone", customers.get(4096).getLastName());
	}

	@Test
	@DisplayName("Record 4097: Company is Chacon, Miguel A Esq")
	void CompanyOfRecord4097() {
		assertEquals("Chacon, Miguel A Esq", customers.get(4096).getCompany());
	}

	@Test
	@DisplayName("Record 4097: Address is 237 Skylark Ct")
	void AddressOfRecord4097() {
		assertEquals("237 Skylark Ct", customers.get(4096).getAddress());
	}

	@Test
	@DisplayName("Record 4097: City is Bartlett")
	void CityOfRecord4097() {
		assertEquals("Bartlett", customers.get(4096).getCity());
	}

	@Test
	@DisplayName("Record 4097: County is DuPage")
	void CountyOfRecord4097() {
		assertEquals("DuPage", customers.get(4096).getCounty());
	}

	@Test
	@DisplayName("Record 4097: State is IL")
	void StateOfRecord4097() {
		assertEquals("IL", customers.get(4096).getState());
	}

	@Test
	@DisplayName("Record 4097: ZIP is 60103")
	void ZIPOfRecord4097() {
		assertEquals("60103", customers.get(4096).getZIP());
	}

	@Test
	@DisplayName("Record 4097: Phone is 630-372-7955")
	void PhoneOfRecord4097() {
		assertEquals("630-372-7955", customers.get(4096).getPhone());
	}

	@Test
	@DisplayName("Record 4097: Fax is 630-372-3391")
	void FaxOfRecord4097() {
		assertEquals("630-372-3391", customers.get(4096).getFax());
	}

	@Test
	@DisplayName("Record 4097: Email is burton@bozzone.com")
	void EmailOfRecord4097() {
		assertEquals("burton@bozzone.com", customers.get(4096).getEmail());
	}

	@Test
	@DisplayName("Record 4097: Web is http://www.burtonbozzone.com")
	void WebOfRecord4097() {
		assertEquals("http://www.burtonbozzone.com", customers.get(4096).getWeb());
	}
}
