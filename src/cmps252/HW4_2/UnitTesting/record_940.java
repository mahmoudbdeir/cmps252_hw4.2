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

@Tag("33")
class Record_940 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 940: FirstName is Sylvia")
	void FirstNameOfRecord940() {
		assertEquals("Sylvia", customers.get(939).getFirstName());
	}

	@Test
	@DisplayName("Record 940: LastName is Bonton")
	void LastNameOfRecord940() {
		assertEquals("Bonton", customers.get(939).getLastName());
	}

	@Test
	@DisplayName("Record 940: Company is Whiteford Packing Co")
	void CompanyOfRecord940() {
		assertEquals("Whiteford Packing Co", customers.get(939).getCompany());
	}

	@Test
	@DisplayName("Record 940: Address is 530 E Campbell Ave")
	void AddressOfRecord940() {
		assertEquals("530 E Campbell Ave", customers.get(939).getAddress());
	}

	@Test
	@DisplayName("Record 940: City is Campbell")
	void CityOfRecord940() {
		assertEquals("Campbell", customers.get(939).getCity());
	}

	@Test
	@DisplayName("Record 940: County is Santa Clara")
	void CountyOfRecord940() {
		assertEquals("Santa Clara", customers.get(939).getCounty());
	}

	@Test
	@DisplayName("Record 940: State is CA")
	void StateOfRecord940() {
		assertEquals("CA", customers.get(939).getState());
	}

	@Test
	@DisplayName("Record 940: ZIP is 95008")
	void ZIPOfRecord940() {
		assertEquals("95008", customers.get(939).getZIP());
	}

	@Test
	@DisplayName("Record 940: Phone is 408-379-5386")
	void PhoneOfRecord940() {
		assertEquals("408-379-5386", customers.get(939).getPhone());
	}

	@Test
	@DisplayName("Record 940: Fax is 408-379-8022")
	void FaxOfRecord940() {
		assertEquals("408-379-8022", customers.get(939).getFax());
	}

	@Test
	@DisplayName("Record 940: Email is sylvia@bonton.com")
	void EmailOfRecord940() {
		assertEquals("sylvia@bonton.com", customers.get(939).getEmail());
	}

	@Test
	@DisplayName("Record 940: Web is http://www.sylviabonton.com")
	void WebOfRecord940() {
		assertEquals("http://www.sylviabonton.com", customers.get(939).getWeb());
	}
}
