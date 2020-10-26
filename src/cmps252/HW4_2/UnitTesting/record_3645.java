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
class Record_3645 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3645: FirstName is Pattie")
	void FirstNameOfRecord3645() {
		assertEquals("Pattie", customers.get(3644).getFirstName());
	}

	@Test
	@DisplayName("Record 3645: LastName is Sebion")
	void LastNameOfRecord3645() {
		assertEquals("Sebion", customers.get(3644).getLastName());
	}

	@Test
	@DisplayName("Record 3645: Company is Leland Paper Co Inc")
	void CompanyOfRecord3645() {
		assertEquals("Leland Paper Co Inc", customers.get(3644).getCompany());
	}

	@Test
	@DisplayName("Record 3645: Address is 307 S 3rd Ave")
	void AddressOfRecord3645() {
		assertEquals("307 S 3rd Ave", customers.get(3644).getAddress());
	}

	@Test
	@DisplayName("Record 3645: City is Yakima")
	void CityOfRecord3645() {
		assertEquals("Yakima", customers.get(3644).getCity());
	}

	@Test
	@DisplayName("Record 3645: County is Yakima")
	void CountyOfRecord3645() {
		assertEquals("Yakima", customers.get(3644).getCounty());
	}

	@Test
	@DisplayName("Record 3645: State is WA")
	void StateOfRecord3645() {
		assertEquals("WA", customers.get(3644).getState());
	}

	@Test
	@DisplayName("Record 3645: ZIP is 98902")
	void ZIPOfRecord3645() {
		assertEquals("98902", customers.get(3644).getZIP());
	}

	@Test
	@DisplayName("Record 3645: Phone is 509-453-4904")
	void PhoneOfRecord3645() {
		assertEquals("509-453-4904", customers.get(3644).getPhone());
	}

	@Test
	@DisplayName("Record 3645: Fax is 509-453-0743")
	void FaxOfRecord3645() {
		assertEquals("509-453-0743", customers.get(3644).getFax());
	}

	@Test
	@DisplayName("Record 3645: Email is pattie@sebion.com")
	void EmailOfRecord3645() {
		assertEquals("pattie@sebion.com", customers.get(3644).getEmail());
	}

	@Test
	@DisplayName("Record 3645: Web is http://www.pattiesebion.com")
	void WebOfRecord3645() {
		assertEquals("http://www.pattiesebion.com", customers.get(3644).getWeb());
	}
}
