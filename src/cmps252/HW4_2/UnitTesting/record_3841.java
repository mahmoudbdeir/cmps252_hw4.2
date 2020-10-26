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

@Tag("12")
class Record_3841 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3841: FirstName is Octavio")
	void FirstNameOfRecord3841() {
		assertEquals("Octavio", customers.get(3840).getFirstName());
	}

	@Test
	@DisplayName("Record 3841: LastName is Lydon")
	void LastNameOfRecord3841() {
		assertEquals("Lydon", customers.get(3840).getLastName());
	}

	@Test
	@DisplayName("Record 3841: Company is Saint Louis Bearing Co Inc")
	void CompanyOfRecord3841() {
		assertEquals("Saint Louis Bearing Co Inc", customers.get(3840).getCompany());
	}

	@Test
	@DisplayName("Record 3841: Address is 901 Jamestown Bldg")
	void AddressOfRecord3841() {
		assertEquals("901 Jamestown Bldg", customers.get(3840).getAddress());
	}

	@Test
	@DisplayName("Record 3841: City is Jamestown")
	void CityOfRecord3841() {
		assertEquals("Jamestown", customers.get(3840).getCity());
	}

	@Test
	@DisplayName("Record 3841: County is Chautauqua")
	void CountyOfRecord3841() {
		assertEquals("Chautauqua", customers.get(3840).getCounty());
	}

	@Test
	@DisplayName("Record 3841: State is NY")
	void StateOfRecord3841() {
		assertEquals("NY", customers.get(3840).getState());
	}

	@Test
	@DisplayName("Record 3841: ZIP is 14701")
	void ZIPOfRecord3841() {
		assertEquals("14701", customers.get(3840).getZIP());
	}

	@Test
	@DisplayName("Record 3841: Phone is 716-483-3785")
	void PhoneOfRecord3841() {
		assertEquals("716-483-3785", customers.get(3840).getPhone());
	}

	@Test
	@DisplayName("Record 3841: Fax is 716-483-8918")
	void FaxOfRecord3841() {
		assertEquals("716-483-8918", customers.get(3840).getFax());
	}

	@Test
	@DisplayName("Record 3841: Email is octavio@lydon.com")
	void EmailOfRecord3841() {
		assertEquals("octavio@lydon.com", customers.get(3840).getEmail());
	}

	@Test
	@DisplayName("Record 3841: Web is http://www.octaviolydon.com")
	void WebOfRecord3841() {
		assertEquals("http://www.octaviolydon.com", customers.get(3840).getWeb());
	}
}
