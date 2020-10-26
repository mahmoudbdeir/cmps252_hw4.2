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

@Tag("18")
class Record_2546 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2546: FirstName is Lyndon")
	void FirstNameOfRecord2546() {
		assertEquals("Lyndon", customers.get(2545).getFirstName());
	}

	@Test
	@DisplayName("Record 2546: LastName is Carlis")
	void LastNameOfRecord2546() {
		assertEquals("Carlis", customers.get(2545).getLastName());
	}

	@Test
	@DisplayName("Record 2546: Company is Strehlow Insurance By")
	void CompanyOfRecord2546() {
		assertEquals("Strehlow Insurance By", customers.get(2545).getCompany());
	}

	@Test
	@DisplayName("Record 2546: Address is 1 Albion Rd")
	void AddressOfRecord2546() {
		assertEquals("1 Albion Rd", customers.get(2545).getAddress());
	}

	@Test
	@DisplayName("Record 2546: City is Lincoln")
	void CityOfRecord2546() {
		assertEquals("Lincoln", customers.get(2545).getCity());
	}

	@Test
	@DisplayName("Record 2546: County is Providence")
	void CountyOfRecord2546() {
		assertEquals("Providence", customers.get(2545).getCounty());
	}

	@Test
	@DisplayName("Record 2546: State is RI")
	void StateOfRecord2546() {
		assertEquals("RI", customers.get(2545).getState());
	}

	@Test
	@DisplayName("Record 2546: ZIP is 2865")
	void ZIPOfRecord2546() {
		assertEquals("2865", customers.get(2545).getZIP());
	}

	@Test
	@DisplayName("Record 2546: Phone is 401-334-7603")
	void PhoneOfRecord2546() {
		assertEquals("401-334-7603", customers.get(2545).getPhone());
	}

	@Test
	@DisplayName("Record 2546: Fax is 401-334-7693")
	void FaxOfRecord2546() {
		assertEquals("401-334-7693", customers.get(2545).getFax());
	}

	@Test
	@DisplayName("Record 2546: Email is lyndon@carlis.com")
	void EmailOfRecord2546() {
		assertEquals("lyndon@carlis.com", customers.get(2545).getEmail());
	}

	@Test
	@DisplayName("Record 2546: Web is http://www.lyndoncarlis.com")
	void WebOfRecord2546() {
		assertEquals("http://www.lyndoncarlis.com", customers.get(2545).getWeb());
	}
}
