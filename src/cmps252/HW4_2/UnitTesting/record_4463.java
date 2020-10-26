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

@Tag("14")
class Record_4463 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4463: FirstName is Barry")
	void FirstNameOfRecord4463() {
		assertEquals("Barry", customers.get(4462).getFirstName());
	}

	@Test
	@DisplayName("Record 4463: LastName is Unzueta")
	void LastNameOfRecord4463() {
		assertEquals("Unzueta", customers.get(4462).getLastName());
	}

	@Test
	@DisplayName("Record 4463: Company is Ryman Pontiac")
	void CompanyOfRecord4463() {
		assertEquals("Ryman Pontiac", customers.get(4462).getCompany());
	}

	@Test
	@DisplayName("Record 4463: Address is 25 Bloomsbury Ave")
	void AddressOfRecord4463() {
		assertEquals("25 Bloomsbury Ave", customers.get(4462).getAddress());
	}

	@Test
	@DisplayName("Record 4463: City is Catonsville")
	void CityOfRecord4463() {
		assertEquals("Catonsville", customers.get(4462).getCity());
	}

	@Test
	@DisplayName("Record 4463: County is Baltimore")
	void CountyOfRecord4463() {
		assertEquals("Baltimore", customers.get(4462).getCounty());
	}

	@Test
	@DisplayName("Record 4463: State is MD")
	void StateOfRecord4463() {
		assertEquals("MD", customers.get(4462).getState());
	}

	@Test
	@DisplayName("Record 4463: ZIP is 21228")
	void ZIPOfRecord4463() {
		assertEquals("21228", customers.get(4462).getZIP());
	}

	@Test
	@DisplayName("Record 4463: Phone is 410-747-1153")
	void PhoneOfRecord4463() {
		assertEquals("410-747-1153", customers.get(4462).getPhone());
	}

	@Test
	@DisplayName("Record 4463: Fax is 410-747-7513")
	void FaxOfRecord4463() {
		assertEquals("410-747-7513", customers.get(4462).getFax());
	}

	@Test
	@DisplayName("Record 4463: Email is barry@unzueta.com")
	void EmailOfRecord4463() {
		assertEquals("barry@unzueta.com", customers.get(4462).getEmail());
	}

	@Test
	@DisplayName("Record 4463: Web is http://www.barryunzueta.com")
	void WebOfRecord4463() {
		assertEquals("http://www.barryunzueta.com", customers.get(4462).getWeb());
	}
}
