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
class Record_3667 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3667: FirstName is Gisela")
	void FirstNameOfRecord3667() {
		assertEquals("Gisela", customers.get(3666).getFirstName());
	}

	@Test
	@DisplayName("Record 3667: LastName is Gifford")
	void LastNameOfRecord3667() {
		assertEquals("Gifford", customers.get(3666).getLastName());
	}

	@Test
	@DisplayName("Record 3667: Company is Edic")
	void CompanyOfRecord3667() {
		assertEquals("Edic", customers.get(3666).getCompany());
	}

	@Test
	@DisplayName("Record 3667: Address is 2711 Broening Hwy")
	void AddressOfRecord3667() {
		assertEquals("2711 Broening Hwy", customers.get(3666).getAddress());
	}

	@Test
	@DisplayName("Record 3667: City is Dundalk")
	void CityOfRecord3667() {
		assertEquals("Dundalk", customers.get(3666).getCity());
	}

	@Test
	@DisplayName("Record 3667: County is Baltimore")
	void CountyOfRecord3667() {
		assertEquals("Baltimore", customers.get(3666).getCounty());
	}

	@Test
	@DisplayName("Record 3667: State is MD")
	void StateOfRecord3667() {
		assertEquals("MD", customers.get(3666).getState());
	}

	@Test
	@DisplayName("Record 3667: ZIP is 21222")
	void ZIPOfRecord3667() {
		assertEquals("21222", customers.get(3666).getZIP());
	}

	@Test
	@DisplayName("Record 3667: Phone is 410-284-6610")
	void PhoneOfRecord3667() {
		assertEquals("410-284-6610", customers.get(3666).getPhone());
	}

	@Test
	@DisplayName("Record 3667: Fax is 410-284-6679")
	void FaxOfRecord3667() {
		assertEquals("410-284-6679", customers.get(3666).getFax());
	}

	@Test
	@DisplayName("Record 3667: Email is gisela@gifford.com")
	void EmailOfRecord3667() {
		assertEquals("gisela@gifford.com", customers.get(3666).getEmail());
	}

	@Test
	@DisplayName("Record 3667: Web is http://www.giselagifford.com")
	void WebOfRecord3667() {
		assertEquals("http://www.giselagifford.com", customers.get(3666).getWeb());
	}
}
