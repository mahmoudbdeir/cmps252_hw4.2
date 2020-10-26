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

@Tag("41")
class Record_3896 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3896: FirstName is Arlie")
	void FirstNameOfRecord3896() {
		assertEquals("Arlie", customers.get(3895).getFirstName());
	}

	@Test
	@DisplayName("Record 3896: LastName is Parcel")
	void LastNameOfRecord3896() {
		assertEquals("Parcel", customers.get(3895).getLastName());
	}

	@Test
	@DisplayName("Record 3896: Company is Crescent City Printing")
	void CompanyOfRecord3896() {
		assertEquals("Crescent City Printing", customers.get(3895).getCompany());
	}

	@Test
	@DisplayName("Record 3896: Address is 1845 Market St")
	void AddressOfRecord3896() {
		assertEquals("1845 Market St", customers.get(3895).getAddress());
	}

	@Test
	@DisplayName("Record 3896: City is Camp Hill")
	void CityOfRecord3896() {
		assertEquals("Camp Hill", customers.get(3895).getCity());
	}

	@Test
	@DisplayName("Record 3896: County is Cumberland")
	void CountyOfRecord3896() {
		assertEquals("Cumberland", customers.get(3895).getCounty());
	}

	@Test
	@DisplayName("Record 3896: State is PA")
	void StateOfRecord3896() {
		assertEquals("PA", customers.get(3895).getState());
	}

	@Test
	@DisplayName("Record 3896: ZIP is 17011")
	void ZIPOfRecord3896() {
		assertEquals("17011", customers.get(3895).getZIP());
	}

	@Test
	@DisplayName("Record 3896: Phone is 717-761-2400")
	void PhoneOfRecord3896() {
		assertEquals("717-761-2400", customers.get(3895).getPhone());
	}

	@Test
	@DisplayName("Record 3896: Fax is 717-761-4848")
	void FaxOfRecord3896() {
		assertEquals("717-761-4848", customers.get(3895).getFax());
	}

	@Test
	@DisplayName("Record 3896: Email is arlie@parcel.com")
	void EmailOfRecord3896() {
		assertEquals("arlie@parcel.com", customers.get(3895).getEmail());
	}

	@Test
	@DisplayName("Record 3896: Web is http://www.arlieparcel.com")
	void WebOfRecord3896() {
		assertEquals("http://www.arlieparcel.com", customers.get(3895).getWeb());
	}
}
