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

@Tag("45")
class Record_4426 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4426: FirstName is Dorris")
	void FirstNameOfRecord4426() {
		assertEquals("Dorris", customers.get(4425).getFirstName());
	}

	@Test
	@DisplayName("Record 4426: LastName is Rownd")
	void LastNameOfRecord4426() {
		assertEquals("Rownd", customers.get(4425).getLastName());
	}

	@Test
	@DisplayName("Record 4426: Company is Xorbox Corp")
	void CompanyOfRecord4426() {
		assertEquals("Xorbox Corp", customers.get(4425).getCompany());
	}

	@Test
	@DisplayName("Record 4426: Address is 1295 S Johnson Dr")
	void AddressOfRecord4426() {
		assertEquals("1295 S Johnson Dr", customers.get(4425).getAddress());
	}

	@Test
	@DisplayName("Record 4426: City is Hacienda Hyghts")
	void CityOfRecord4426() {
		assertEquals("Hacienda Hyghts", customers.get(4425).getCity());
	}

	@Test
	@DisplayName("Record 4426: County is Los Angeles")
	void CountyOfRecord4426() {
		assertEquals("Los Angeles", customers.get(4425).getCounty());
	}

	@Test
	@DisplayName("Record 4426: State is CA")
	void StateOfRecord4426() {
		assertEquals("CA", customers.get(4425).getState());
	}

	@Test
	@DisplayName("Record 4426: ZIP is 91745")
	void ZIPOfRecord4426() {
		assertEquals("91745", customers.get(4425).getZIP());
	}

	@Test
	@DisplayName("Record 4426: Phone is 626-937-1365")
	void PhoneOfRecord4426() {
		assertEquals("626-937-1365", customers.get(4425).getPhone());
	}

	@Test
	@DisplayName("Record 4426: Fax is 626-937-9781")
	void FaxOfRecord4426() {
		assertEquals("626-937-9781", customers.get(4425).getFax());
	}

	@Test
	@DisplayName("Record 4426: Email is dorris@rownd.com")
	void EmailOfRecord4426() {
		assertEquals("dorris@rownd.com", customers.get(4425).getEmail());
	}

	@Test
	@DisplayName("Record 4426: Web is http://www.dorrisrownd.com")
	void WebOfRecord4426() {
		assertEquals("http://www.dorrisrownd.com", customers.get(4425).getWeb());
	}
}
