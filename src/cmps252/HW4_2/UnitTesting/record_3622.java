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

@Tag("19")
class Record_3622 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3622: FirstName is Willian")
	void FirstNameOfRecord3622() {
		assertEquals("Willian", customers.get(3621).getFirstName());
	}

	@Test
	@DisplayName("Record 3622: LastName is Cassase")
	void LastNameOfRecord3622() {
		assertEquals("Cassase", customers.get(3621).getLastName());
	}

	@Test
	@DisplayName("Record 3622: Company is Amercn Pseudo Obstruction")
	void CompanyOfRecord3622() {
		assertEquals("Amercn Pseudo Obstruction", customers.get(3621).getCompany());
	}

	@Test
	@DisplayName("Record 3622: Address is 1 Monument Sq")
	void AddressOfRecord3622() {
		assertEquals("1 Monument Sq", customers.get(3621).getAddress());
	}

	@Test
	@DisplayName("Record 3622: City is Portland")
	void CityOfRecord3622() {
		assertEquals("Portland", customers.get(3621).getCity());
	}

	@Test
	@DisplayName("Record 3622: County is Cumberland")
	void CountyOfRecord3622() {
		assertEquals("Cumberland", customers.get(3621).getCounty());
	}

	@Test
	@DisplayName("Record 3622: State is ME")
	void StateOfRecord3622() {
		assertEquals("ME", customers.get(3621).getState());
	}

	@Test
	@DisplayName("Record 3622: ZIP is 4101")
	void ZIPOfRecord3622() {
		assertEquals("4101", customers.get(3621).getZIP());
	}

	@Test
	@DisplayName("Record 3622: Phone is 207-773-5411")
	void PhoneOfRecord3622() {
		assertEquals("207-773-5411", customers.get(3621).getPhone());
	}

	@Test
	@DisplayName("Record 3622: Fax is 207-773-8986")
	void FaxOfRecord3622() {
		assertEquals("207-773-8986", customers.get(3621).getFax());
	}

	@Test
	@DisplayName("Record 3622: Email is willian@cassase.com")
	void EmailOfRecord3622() {
		assertEquals("willian@cassase.com", customers.get(3621).getEmail());
	}

	@Test
	@DisplayName("Record 3622: Web is http://www.williancassase.com")
	void WebOfRecord3622() {
		assertEquals("http://www.williancassase.com", customers.get(3621).getWeb());
	}
}
