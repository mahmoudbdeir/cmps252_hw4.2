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

@Tag("0")
class Record_3127 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3127: FirstName is Verna")
	void FirstNameOfRecord3127() {
		assertEquals("Verna", customers.get(3126).getFirstName());
	}

	@Test
	@DisplayName("Record 3127: LastName is Bargstadt")
	void LastNameOfRecord3127() {
		assertEquals("Bargstadt", customers.get(3126).getLastName());
	}

	@Test
	@DisplayName("Record 3127: Company is Kpmg Peat Marwick")
	void CompanyOfRecord3127() {
		assertEquals("Kpmg Peat Marwick", customers.get(3126).getCompany());
	}

	@Test
	@DisplayName("Record 3127: Address is 77 Amity St")
	void AddressOfRecord3127() {
		assertEquals("77 Amity St", customers.get(3126).getAddress());
	}

	@Test
	@DisplayName("Record 3127: City is Jersey City")
	void CityOfRecord3127() {
		assertEquals("Jersey City", customers.get(3126).getCity());
	}

	@Test
	@DisplayName("Record 3127: County is Hudson")
	void CountyOfRecord3127() {
		assertEquals("Hudson", customers.get(3126).getCounty());
	}

	@Test
	@DisplayName("Record 3127: State is NJ")
	void StateOfRecord3127() {
		assertEquals("NJ", customers.get(3126).getState());
	}

	@Test
	@DisplayName("Record 3127: ZIP is 7304")
	void ZIPOfRecord3127() {
		assertEquals("7304", customers.get(3126).getZIP());
	}

	@Test
	@DisplayName("Record 3127: Phone is 201-432-5491")
	void PhoneOfRecord3127() {
		assertEquals("201-432-5491", customers.get(3126).getPhone());
	}

	@Test
	@DisplayName("Record 3127: Fax is 201-432-2052")
	void FaxOfRecord3127() {
		assertEquals("201-432-2052", customers.get(3126).getFax());
	}

	@Test
	@DisplayName("Record 3127: Email is verna@bargstadt.com")
	void EmailOfRecord3127() {
		assertEquals("verna@bargstadt.com", customers.get(3126).getEmail());
	}

	@Test
	@DisplayName("Record 3127: Web is http://www.vernabargstadt.com")
	void WebOfRecord3127() {
		assertEquals("http://www.vernabargstadt.com", customers.get(3126).getWeb());
	}
}
