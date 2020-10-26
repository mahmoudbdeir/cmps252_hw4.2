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

@Tag("35")
class Record_1771 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1771: FirstName is Dorris")
	void FirstNameOfRecord1771() {
		assertEquals("Dorris", customers.get(1770).getFirstName());
	}

	@Test
	@DisplayName("Record 1771: LastName is Pottebeam")
	void LastNameOfRecord1771() {
		assertEquals("Pottebeam", customers.get(1770).getLastName());
	}

	@Test
	@DisplayName("Record 1771: Company is Thomas W Kyth Pc")
	void CompanyOfRecord1771() {
		assertEquals("Thomas W Kyth Pc", customers.get(1770).getCompany());
	}

	@Test
	@DisplayName("Record 1771: Address is 907 Logan Ave")
	void AddressOfRecord1771() {
		assertEquals("907 Logan Ave", customers.get(1770).getAddress());
	}

	@Test
	@DisplayName("Record 1771: City is Cheyenne")
	void CityOfRecord1771() {
		assertEquals("Cheyenne", customers.get(1770).getCity());
	}

	@Test
	@DisplayName("Record 1771: County is Laramie")
	void CountyOfRecord1771() {
		assertEquals("Laramie", customers.get(1770).getCounty());
	}

	@Test
	@DisplayName("Record 1771: State is WY")
	void StateOfRecord1771() {
		assertEquals("WY", customers.get(1770).getState());
	}

	@Test
	@DisplayName("Record 1771: ZIP is 82001")
	void ZIPOfRecord1771() {
		assertEquals("82001", customers.get(1770).getZIP());
	}

	@Test
	@DisplayName("Record 1771: Phone is 307-778-4903")
	void PhoneOfRecord1771() {
		assertEquals("307-778-4903", customers.get(1770).getPhone());
	}

	@Test
	@DisplayName("Record 1771: Fax is 307-778-7285")
	void FaxOfRecord1771() {
		assertEquals("307-778-7285", customers.get(1770).getFax());
	}

	@Test
	@DisplayName("Record 1771: Email is dorris@pottebeam.com")
	void EmailOfRecord1771() {
		assertEquals("dorris@pottebeam.com", customers.get(1770).getEmail());
	}

	@Test
	@DisplayName("Record 1771: Web is http://www.dorrispottebeam.com")
	void WebOfRecord1771() {
		assertEquals("http://www.dorrispottebeam.com", customers.get(1770).getWeb());
	}
}
