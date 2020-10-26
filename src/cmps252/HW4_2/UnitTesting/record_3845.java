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

@Tag("34")
class Record_3845 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3845: FirstName is Sophie")
	void FirstNameOfRecord3845() {
		assertEquals("Sophie", customers.get(3844).getFirstName());
	}

	@Test
	@DisplayName("Record 3845: LastName is Claton")
	void LastNameOfRecord3845() {
		assertEquals("Claton", customers.get(3844).getLastName());
	}

	@Test
	@DisplayName("Record 3845: Company is Josiah Macy Jr Foundtn")
	void CompanyOfRecord3845() {
		assertEquals("Josiah Macy Jr Foundtn", customers.get(3844).getCompany());
	}

	@Test
	@DisplayName("Record 3845: Address is 901 Jamestown Bldg")
	void AddressOfRecord3845() {
		assertEquals("901 Jamestown Bldg", customers.get(3844).getAddress());
	}

	@Test
	@DisplayName("Record 3845: City is Jamestown")
	void CityOfRecord3845() {
		assertEquals("Jamestown", customers.get(3844).getCity());
	}

	@Test
	@DisplayName("Record 3845: County is Chautauqua")
	void CountyOfRecord3845() {
		assertEquals("Chautauqua", customers.get(3844).getCounty());
	}

	@Test
	@DisplayName("Record 3845: State is NY")
	void StateOfRecord3845() {
		assertEquals("NY", customers.get(3844).getState());
	}

	@Test
	@DisplayName("Record 3845: ZIP is 14701")
	void ZIPOfRecord3845() {
		assertEquals("14701", customers.get(3844).getZIP());
	}

	@Test
	@DisplayName("Record 3845: Phone is 716-483-9051")
	void PhoneOfRecord3845() {
		assertEquals("716-483-9051", customers.get(3844).getPhone());
	}

	@Test
	@DisplayName("Record 3845: Fax is 716-483-4574")
	void FaxOfRecord3845() {
		assertEquals("716-483-4574", customers.get(3844).getFax());
	}

	@Test
	@DisplayName("Record 3845: Email is sophie@claton.com")
	void EmailOfRecord3845() {
		assertEquals("sophie@claton.com", customers.get(3844).getEmail());
	}

	@Test
	@DisplayName("Record 3845: Web is http://www.sophieclaton.com")
	void WebOfRecord3845() {
		assertEquals("http://www.sophieclaton.com", customers.get(3844).getWeb());
	}
}
