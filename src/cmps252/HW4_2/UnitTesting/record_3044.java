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

@Tag("24")
class Record_3044 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3044: FirstName is Jamie")
	void FirstNameOfRecord3044() {
		assertEquals("Jamie", customers.get(3043).getFirstName());
	}

	@Test
	@DisplayName("Record 3044: LastName is Monterroza")
	void LastNameOfRecord3044() {
		assertEquals("Monterroza", customers.get(3043).getLastName());
	}

	@Test
	@DisplayName("Record 3044: Company is Veterans Thrift Stores Inc")
	void CompanyOfRecord3044() {
		assertEquals("Veterans Thrift Stores Inc", customers.get(3043).getCompany());
	}

	@Test
	@DisplayName("Record 3044: Address is 920 Van Reed Rd")
	void AddressOfRecord3044() {
		assertEquals("920 Van Reed Rd", customers.get(3043).getAddress());
	}

	@Test
	@DisplayName("Record 3044: City is Reading")
	void CityOfRecord3044() {
		assertEquals("Reading", customers.get(3043).getCity());
	}

	@Test
	@DisplayName("Record 3044: County is Berks")
	void CountyOfRecord3044() {
		assertEquals("Berks", customers.get(3043).getCounty());
	}

	@Test
	@DisplayName("Record 3044: State is PA")
	void StateOfRecord3044() {
		assertEquals("PA", customers.get(3043).getState());
	}

	@Test
	@DisplayName("Record 3044: ZIP is 19610")
	void ZIPOfRecord3044() {
		assertEquals("19610", customers.get(3043).getZIP());
	}

	@Test
	@DisplayName("Record 3044: Phone is 610-478-8802")
	void PhoneOfRecord3044() {
		assertEquals("610-478-8802", customers.get(3043).getPhone());
	}

	@Test
	@DisplayName("Record 3044: Fax is 610-478-7285")
	void FaxOfRecord3044() {
		assertEquals("610-478-7285", customers.get(3043).getFax());
	}

	@Test
	@DisplayName("Record 3044: Email is jamie@monterroza.com")
	void EmailOfRecord3044() {
		assertEquals("jamie@monterroza.com", customers.get(3043).getEmail());
	}

	@Test
	@DisplayName("Record 3044: Web is http://www.jamiemonterroza.com")
	void WebOfRecord3044() {
		assertEquals("http://www.jamiemonterroza.com", customers.get(3043).getWeb());
	}
}
